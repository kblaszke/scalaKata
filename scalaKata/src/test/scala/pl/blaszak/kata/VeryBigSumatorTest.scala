package pl.blaszak.kata

import org.scalatest.FunSuite

class VeryBigSumatorTest extends FunSuite {

  test("VeryBigSumator.scala") {
    assert(VeryBigSumator.sum(5, Array(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)) === 5000000015L)
  }

}
