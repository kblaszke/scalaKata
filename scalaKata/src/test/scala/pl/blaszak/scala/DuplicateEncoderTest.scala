package pl.blaszak.scala

import org.scalatest.FunSuite
import pl.blaszak.kata.DuplicateEncoder

class DuplicateEncoderTest extends FunSuite {

  test("DuplicateEncoder.scala") {
    assert(DuplicateEncoder.encode("din") === "(((")
    assert(DuplicateEncoder.encode("recede") === "()()()")
    assert(DuplicateEncoder.encode("Success") === ")())())")
    assert(DuplicateEncoder.encode("(( @") === "))((")
  }

}
