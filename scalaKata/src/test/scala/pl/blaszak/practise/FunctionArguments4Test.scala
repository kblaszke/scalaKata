package pl.blaszak.practise

import org.scalatest.FunSuite

class FunctionArguments4Test extends FunSuite {

  test("testSumInts") {
    assert(FunctionArguments4.sumInts(5, 10) === 45)
  }

  test("testSumSquares") {
    assert(FunctionArguments4.sumSquares(5, 10) === 355)
  }

  test("testSumPowersOfTwo") {
    assert(FunctionArguments4.sumPowersOfTwo(5, 10) === 2016)
  }

}
