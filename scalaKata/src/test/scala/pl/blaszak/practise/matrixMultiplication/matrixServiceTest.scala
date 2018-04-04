package pl.blaszak.practise.matrixMultiplication

import org.scalatest.FunSuite

class matrixServiceTest extends FunSuite {

  test("Test default strategy") {
    val x = new Matrix(Array(Array(1,2,3), Array(4,5,6)))
    val y = new Matrix(Array(Array(1), Array(1), Array(1)))
    println(x.toString)
    println(y.toString)
    println(matrixService.multiply(x, y).toString)
  }

  test("Test concurent strategy") {
    implicit val ts = threadStrategy.ThreadPoolStrategy
    val x = new Matrix(Array(Array(1,2,3), Array(4,5,6)))
    val y = new Matrix(Array(Array(1), Array(1), Array(1)))
    println(x.toString)
    println(y.toString)
    println(matrixService.multiply(x, y).toString)
  }

}
