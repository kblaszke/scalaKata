package pl.blaszak.practise

import org.scalatest.FunSuite

class FunctionArgumentsTest extends FunSuite {

  test("testSumInts") {
    assert(FunctionArguments.sumInts(5, 10) === 45)
  }

  test("testSumSquares") {
    assert(FunctionArguments.sumSquares(5, 10) === 355)
  }

  test("testSumPowersOfTwo") {
    assert(FunctionArguments.sumPowersOfTwo(5, 10) === 2016)
  }

}
