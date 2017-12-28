package pl.blaszak.kata.implementation.timeinwords

import org.scalatest.FunSuite

class TheTimeInWordsTest extends FunSuite {

  test("FullHourConversion") {
    assert(TheTimeInWords.convert(5, 0) === "five o' clock")
  }

  test("To half an hour test") {
    assert(TheTimeInWords.convert(5, 1) === "one minute past five")
    assert(TheTimeInWords.convert(5, 10) === "ten minutes past five")
    assert(TheTimeInWords.convert(5, 15) === "quarter past five")
    assert(TheTimeInWords.convert(5, 30) === "half past five")
    assert(TheTimeInWords.convert(5, 28) === "twenty eight minutes past five")
  }

  test("More then half an hour test") {
    assert(TheTimeInWords.convert(5, 40) === "twenty minutes to six")
    assert(TheTimeInWords.convert(5, 45) === "quarter to six")
    assert(TheTimeInWords.convert(5, 47) === "thirteen minutes to six")
  }

}
