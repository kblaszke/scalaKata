package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class TimeConverterTest extends FunSuite {

  test("TimeConverter.scala") {
    assert(TimeConverter.timeConversion("07:05:45PM") === "19:05:45")
    assert(TimeConverter.timeConversion("12:00:00AM") === "00:00:00")
    assert(TimeConverter.timeConversion("12:00:00PM") === "12:00:00")
  }

}
