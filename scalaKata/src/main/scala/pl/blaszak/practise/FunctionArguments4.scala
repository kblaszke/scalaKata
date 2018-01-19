package pl.blaszak.practise

object FunctionArguments4 {

  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    }
    sumF
  }

  def sumInts = sum(x => x)
  def sumSquares = sum(x => x * x)
  def sumPowersOfTwo = sum(powerOfTwo)

}
