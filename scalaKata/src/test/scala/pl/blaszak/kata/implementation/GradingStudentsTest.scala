package pl.blaszak.kata.implementation

import org.scalatest.FunSuite

class GradingStudentsTest extends FunSuite {

  test("GradingStudents.scala") {
    assert(GradingStudents.grade(Array(73, 67, 38, 33)) === Array(75, 67, 40, 33))
    GradingStudents.grade(Array(73, 67, 38, 33)).foreach(g => println(g))
  }

}
