package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class MiniMaxSumTest extends FunSuite {

  test("MinMaxSum.scala") {
    assert(MiniMaxSum.getSums(Array(1,2,3,4,5)) === "10 14")
    assert(MiniMaxSum.getSums(Array(5, 5, 5, 5, 5)) === "20 20")
  }

}
