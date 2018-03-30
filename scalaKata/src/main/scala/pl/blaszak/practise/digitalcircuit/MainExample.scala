package pl.blaszak.practise.digitalcircuit

object MainExample extends Circuits {

  def main(args: Array[String]): Unit = {

    val input1, input2, sum = new Wire

    probe("input1", input1)
    probe("input2", input2)
    probe("sum", sum)

    // halfAdder(input1, input2, sum, carry)
    orGate(input1, input2, sum)
    input1 setSignal true
    input2 setSignal true
    run
  }

}
