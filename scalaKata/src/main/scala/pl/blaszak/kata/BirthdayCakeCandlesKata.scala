package pl.blaszak.kata

object BirthdayCakeCandlesKata {

  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int =  {
    val maxHeigth = ar.max
    ar.count(c => c == maxHeigth)
  }

}
