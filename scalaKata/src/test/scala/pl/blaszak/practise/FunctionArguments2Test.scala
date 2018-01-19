package pl.blaszak.practise

import org.scalatest.FunSuite

class FunctionArguments2Test extends FunSuite {

  test("testSumInts") {
    assert(FunctionArguments2.sumInts(5, 10) === 45)
  }

  test("testSumSquares") {
    assert(FunctionArguments2.sumSquares(5, 10) === 355)
  }

  test("testSumPowersOfTwo") {
    assert(FunctionArguments2.sumPowersOfTwo(5, 10) === 2016)
  }

}
