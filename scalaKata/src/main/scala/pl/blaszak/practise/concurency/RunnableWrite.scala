package pl.blaszak.practise.concurency

import scala.util.Random

class RunnableWrite(indexService: Service[Int, Int]) extends Runnable {

  var index = 0;
  val random = Random
  val maxIndex = 10000

  def isRunning(): Boolean = if(index < maxIndex) true else false

  override def run(): Unit = {
    while(index < maxIndex) {
      val key = random nextInt 1000
      val intValue = random nextInt 1000
      indexService.insert(key, intValue)
      index += 1
      val sleepTime = random nextInt 3
      Thread sleep sleepTime
    }
  }
}
