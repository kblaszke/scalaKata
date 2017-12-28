package pl.blaszak.kata.wormup

object BirthdayCakeCandlesKata {

  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int =  {
    val maxHeigth = ar.max
    ar.count(c => c == maxHeigth)
  }

}
