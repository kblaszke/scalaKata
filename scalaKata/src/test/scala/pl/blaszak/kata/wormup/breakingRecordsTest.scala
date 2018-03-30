package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class breakingRecordsTest extends FunSuite {

  test("testBreakingRecords") {
    assert(breakingRecords.breakingRecords(List(10, 5, 20, 20, 4, 5, 2, 25, 1)) === Some((4, 2)))
  }

}
