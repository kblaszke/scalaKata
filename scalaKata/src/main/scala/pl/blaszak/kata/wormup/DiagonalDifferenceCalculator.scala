package pl.blaszak.kata.wormup

object DiagonalDifferenceCalculator {

  def calculate(arr: Array[Array[Int]]): Int = {
    val n = arr.length
    var sum = 0
    for(i <- 0 until n) {
      sum += arr(i)(i)
      sum -= arr(i)(n - i - 1)
    }
    Math.abs(sum)
  }

}
