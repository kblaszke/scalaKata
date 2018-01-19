package pl.blaszak.practise.digitalcircuit

abstract class Gates extends Simulation {

  def inverterDelay = 2
  def andGateDelay = 3
  def orGateDelay = 5

  class Wire {

    private var sigVal = false
    private var actions: List[Action] = List()

    def getSignal = sigVal

    def setSignal(s: Boolean) =
      if (s != sigVal) {
        sigVal = s
        actions foreach(_ ())
      }

    def addAction(a: Action) = {
      actions = a :: actions
      a()
    }
  }

    def inverter(input: Wire, output: Wire): Unit = {
      def invertAction(): Unit = {
        val inputSig = input.getSignal
        afterDelay(inverterDelay) {
          output setSignal !inputSig
        }
      }
      input addAction invertAction
    }

    def andGate(in1: Wire, in2: Wire, output: Wire): Unit = {
      def andAction() = {
        val in1sig = in1.getSignal
        val in2sig = in2.getSignal
        afterDelay(andGateDelay) {
          output setSignal in1sig & in2sig
        }
      }
      in1 addAction andAction
      in2 addAction andAction
    }

    def orGate(in1: Wire, in2: Wire, output: Wire): Unit = {
      def orAction() = {
        val in1sig = in1.getSignal
        val in2sig = in2.getSignal
        afterDelay(orGateDelay) {
          output setSignal in1sig | in2sig
        }
      }
      in1 addAction orAction
      in2 addAction orAction
    }

    def probe(name: String, wire: Wire): Unit = {
      wire addAction(() => println(name + " " + currentTime + " new value = " + wire.getSignal) )
      /*def probeAction(): Unit = {
        println(name + " " + currentTime + " new value = " + wire.getSignal)
      }
      wire addAction probeAction*/
    }

}
