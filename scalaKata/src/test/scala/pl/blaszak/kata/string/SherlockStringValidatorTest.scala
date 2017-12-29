package pl.blaszak.kata.string

import org.scalatest.FunSuite

class SherlockStringValidatorTest extends FunSuite {

  test("Validate correct string") {
    assert(SherlockStringValidator.valid("aabbcc") === true)
  }

  test("Validate incorrect string") {
    assert(SherlockStringValidator.valid("baacdd") === false)
  }

  test("Validate correct string with additional char") {
    assert(SherlockStringValidator.valid("aabbc") === true)
  }
}
