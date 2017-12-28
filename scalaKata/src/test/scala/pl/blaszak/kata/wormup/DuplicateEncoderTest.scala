package pl.blaszak.kata.wormup

import org.scalatest.FunSuite

class DuplicateEncoderTest extends FunSuite {

  test("DuplicateEncoder.scala") {
    assert(DuplicateEncoder.encode("din") === "(((")
    assert(DuplicateEncoder.encode("recede") === "()()()")
    assert(DuplicateEncoder.encode("Success") === ")())())")
    assert(DuplicateEncoder.encode("(( @") === "))((")
  }

}
