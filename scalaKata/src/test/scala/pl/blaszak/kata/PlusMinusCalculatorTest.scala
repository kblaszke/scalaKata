package pl.blaszak.kata

import org.scalatest.FunSuite

class PlusMinusCalculatorTest extends FunSuite {

  test("PlusMinusCalculator.scala") {
    val arr = Array(-4, 3, -9, 0, 4, 1)
    val results = Array(0.5D, 1/3D, 1/6D)
    assert(PlusMinusCalculator.calculate(arr) === results)
    results.foreach(f => println(f"$f%1.6f"))
  }

}
