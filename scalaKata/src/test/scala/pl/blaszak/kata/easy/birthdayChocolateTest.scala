package pl.blaszak.kata.easy

import org.scalatest.FunSuite

class birthdayChocolateTest extends FunSuite {

  test("testSolve 1") {
    val s = Array(1, 2, 1, 3, 2)
    val d = 3
    val m = 2
    assert(birthdayChocolate.solve(s, d, m) === 2)
  }

  test("testSolve 2") {
    val s = Array(1, 1, 1, 1, 1, 1)
    val d = 3
    val m = 2
    assert(birthdayChocolate.solve(s, d, m) === 0)
  }

  test("testSolve 3") {
    val s = Array(4)
    val d = 4
    val m = 1
    assert(birthdayChocolate.solve(s, d, m) === 1)
  }

}
