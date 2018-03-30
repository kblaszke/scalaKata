package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class breakingRecordsTest extends FunSuite {

  test("testBreakingRecords") {
    assert(breakingRecords.breakingRecords(Nil) === None)
    assert(breakingRecords.breakingRecords(List()) === None)
    assert(breakingRecords.breakingRecords(List(10)) === Some(0, 0))
    assert(breakingRecords.breakingRecords(List(10, 5, 20, 20, 4, 5, 2, 25, 1)) === Some((4, 2)))
    assert(breakingRecords.breakingRecords(List(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)) === Some((0, 4)))
  }

}
