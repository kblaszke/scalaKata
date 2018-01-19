package pl.blaszak.practise

object FixedPoint {

  val tolerance = 0.0001

  def isCloseEnough(x: Double, y: Double) = Math.abs((x - y) / x) < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }

  def sqrt(x: Double) = fixedPoint(averageDamp(y => x/y))(1.0)

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

  def main(args: Array[String]): Unit = {
    val result = sqrt(2.0)
  }
}
