package pl.blaszak.practise.concurency

import scala.util.Random

class RunnableRead(indexService: Service[Int, Int], runnableWrite: RunnableWrite) extends Runnable {
  val random = Random
  var index = 0
  override def run(): Unit = {
    while(runnableWrite isRunning) {
      val key = random.nextInt(1000)
      // println("key = " + key + ", value = " + indexService.lookup(key))
      index += 1
    }
    println(index + " wywołań czytania")
  }
}
