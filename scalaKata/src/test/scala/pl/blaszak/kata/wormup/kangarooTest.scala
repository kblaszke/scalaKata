package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class kangarooTest extends FunSuite {

  test("testWillMeetTogether") {
    assert(kangaroo.willMeetTogether(0, 3, 4, 2) === true)
    assert(kangaroo.willMeetTogether(0, 2, 5, 3) === false)
    assert(kangaroo.willMeetTogether(21, 6, 47, 3) === false)
  }

}
