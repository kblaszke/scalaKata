package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class PlusMinusCalculatorTest extends FunSuite {

  test("PlusMinusCalculator.scala") {
    val arr = Array(-4, 3, -9, 0, 4, 1)
    val tupleResult = PlusMinusCalculator.calculate(arr)
    assert(tupleResult === (1/3D, 1/6D, 0.5D))
    println(tupleResult)
  }

}
