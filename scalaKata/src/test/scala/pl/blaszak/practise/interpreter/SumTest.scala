package pl.blaszak.practise.interpreter

import org.scalatest.FunSuite

class SumTest extends FunSuite {

  test("should sum two numbers") {
    val sum = Sum(Number(1), Number(2))
    sum.print
    assert(sum.eval === 3)
  }

  test("Should sum number and another sum") {
    val sum = Sum(Number(2), Sum(Number(1), Number(3)))
    sum.print
    assert(sum.eval === 6)
  }
}
