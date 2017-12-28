package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class TripleComparatorTest extends FunSuite {

  test("TripleComparator.scala") {
    assert(TripleComparator.compare("5 6 7", "3 6 10") === "1 1")
  }
}
