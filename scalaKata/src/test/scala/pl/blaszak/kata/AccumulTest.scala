package pl.blaszak.kata

import org.scalatest.FunSuite

class AccumulTest extends FunSuite {

  test("Accumul.accum") {
    assert(Accumul.accum("abcd") === "A-Bb-Ccc-Dddd")
    assert(Accumul.accum("RqaEzty") === "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy")
    assert(Accumul.accum("cwAt") === "C-Ww-Aaa-Tttt")
  }
}
