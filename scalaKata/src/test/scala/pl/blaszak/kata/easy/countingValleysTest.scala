package pl.blaszak.kata.easy

import org.scalatest.FunSuite

class countingValleysTest extends FunSuite {

  test("testSolve") {
    val s = "UDDDUDUU"
    assert(countingValleys.solve(s.toList) === 1)
  }

}
