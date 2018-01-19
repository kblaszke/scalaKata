package pl.blaszak.practise

import org.scalatest.FunSuite

class CompartmentTest extends FunSuite {

  test("Should return true for compartments in the same coordinates") {
    assert(new Compartment(0, 1) == new Compartment(0, 1) === true)
  }

  test("should return false for different compartments") {
    assert(new Compartment(0, 1) == new Compartment(1, 2) === false)
  }
}
