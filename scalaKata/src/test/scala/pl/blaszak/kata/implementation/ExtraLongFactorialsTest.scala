package pl.blaszak.kata.implementation

import org.scalatest.FunSuite

class ExtraLongFactorialsTest extends FunSuite {

  test("ExtraLongFactorials.scala") {

    val result = ExtraLongFactorials.factorial(25)
    assert(result === BigInt("15511210043330985984000000"))
    println(result)
  }

}
