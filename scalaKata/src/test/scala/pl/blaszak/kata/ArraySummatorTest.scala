package pl.blaszak.kata

import org.scalatest.FunSuite

class ArraySummatorTest extends FunSuite {

  test("ArraySummator.scala") {
    assert(ArraySummator.simpleArraySum(4, Array(1,2,3,4)) === 10)
  }
}
