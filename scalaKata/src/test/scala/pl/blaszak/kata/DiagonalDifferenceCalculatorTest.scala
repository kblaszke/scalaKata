package pl.blaszak.kata

import org.scalatest.FunSuite

class DiagonalDifferenceCalculatorTest extends FunSuite {

  test("DiagonalDifferenceCalculator.scala") {
    val arr = Array(Array(11, 2, 4), Array(4, 5, 6), Array(10, 8, -12))
    assert(DiagonalDifferenceCalculator.calculate(arr) === 15)
  }

}
