package pl.blaszak.practise

object FunctionArguments3 {

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
  }

  def sumInts(a: Int, b: Int): Int = sum(identity, a, b)
  def sumSquares(a: Int, b: Int): Int = sum(x => x * x, a, b)

}
