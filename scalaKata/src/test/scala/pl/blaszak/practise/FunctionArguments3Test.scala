package pl.blaszak.practise

import org.scalatest.FunSuite

class FunctionArguments3Test extends FunSuite {

  test("testSumInts") {
    assert(FunctionArguments3.sumInts(5, 10) === 45)
  }

  test("testSumSquares") {
    assert(FunctionArguments3.sumSquares(5, 10) === 355)
  }
}
