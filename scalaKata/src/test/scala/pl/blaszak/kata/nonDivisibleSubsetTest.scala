package pl.blaszak.kata

import org.scalatest.FunSuite

class nonDivisibleSubsetTest extends FunSuite {

  test("testNonDivisibleSubset with non divisible input set") {
    assert(nonDivisibleSubset.nonDivisibleSubset(3, List(1, 7, 4)) === 3)
  }

  test("testNonDivisibleSubset with divisible input set") {
    assert(nonDivisibleSubset.nonDivisibleSubset(3, List(1, 2, 7, 4)) === 3)
  }

  test("first failed") {
    val ints = List(770528134, 663501748, 384261537, 800309024, 103668401, 538539662, 385488901, 101262949, 557792122, 46058493)
    assert(nonDivisibleSubset.nonDivisibleSubset(3, ints) === 6)
  }
}
