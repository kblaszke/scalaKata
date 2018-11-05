package pl.blaszak.kata.implementation

import org.scalatest.FunSuite

class gradingStudentsTest extends FunSuite {

  test("GradingStudents.scala") {
    assert(gradingStudents.grade(Array(73, 67, 38, 33)) === Array(75, 67, 40, 33))
    gradingStudents.grade(Array(73, 67, 38, 33)).foreach(g => println(g))
  }

}
