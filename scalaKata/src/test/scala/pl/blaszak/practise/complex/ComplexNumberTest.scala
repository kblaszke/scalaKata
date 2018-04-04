package pl.blaszak.practise.complex

import org.scalatest.FunSuite

class ComplexNumberTest extends FunSuite {

  test("should add two complex numbers") {
    val x = 1 + i
    val y = 2 + 2 * i
    val result = x + y
    assert(result.getImmaginary === 3)
    assert(result.getReal === 3)
  }

  test("should subtract two complex numbers") {
    val x = 1 + i
    val y = 2 + 2 * i
    val result = x - y
    assert(result.getImmaginary === -1)
    assert(result.getReal === -1)
  }

  test("should multiply two complex numbers") {
    val x = 1 + i
    val y = 2 + 2 * i
    val result = x * y
    assert(result.getReal === 0)
    assert(result.getImmaginary === 4)
  }
}
