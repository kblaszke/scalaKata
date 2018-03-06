package pl.blaszak.practise.concurency

object SystemTest {

  def makeTest(service: Service[Int, Int]): Unit = {
    val runnableWrite = new RunnableWrite(service)
    val runnableRead = new RunnableRead(service, runnableWrite)
    val readThread = new Thread(runnableRead)
    val writeThreat = new Thread(runnableWrite)
    writeThreat.start()
    readThread.start()
  }

  def main(args: Array[String]): Unit = {
    makeTest(new MutableService)
    makeTest(new InmutableService)
  }

}
