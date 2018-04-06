package pl.blaszak.kata

import org.scalatest.FunSuite

class magicMatrixTest extends FunSuite {

  test("testIsMagicMatrixForMagicArray") {
    val s = Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 6))
    assert(magicMatrix.isMagicMatrix(s) === true)
  }

  test("testIsMagicMatrixForNotArray") {
    val s = Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 5))
    assert(magicMatrix.isMagicMatrix(s) === false)
  }

  test("findMagicArrayWithMagicArray") {
    val s = Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 6))
    printArray(magicMatrix.findMagicArray(s))
  }

  test("findMagicArrayWithNonMagicArray") {
    val s = Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 5))
    printArray(magicMatrix.findMagicArray(s))
  }

  test("findMagicArrayWithNonMagicArray2") {
    val s = Array(Array(4, 8, 2), Array(4, 5, 7), Array(6, 1, 6))
    printArray(magicMatrix.findMagicArray(s))
  }

  test("Find minimal cost") {
    val s = Array(Array(4, 9, 2), Array(3, 5, 7), Array(8, 1, 5))
    assert(magicMatrix.findMinimalCost(s) === 1)
  }

  test("Find minimal cost2") {
    val s = Array(Array(4, 8, 2), Array(4, 5, 7), Array(6, 1, 6))
    assert(magicMatrix.findMinimalCost(s) === 4)
  }

  test("printAllVariation") {
    val s = Array(Array(4, 8, 2), Array(4, 5, 7), Array(6, 1, 6))
    magicMatrix.createAllVariation(s).foreach(printArray _)
  }

  def printArray(ar: Array[Array[Int]]): Unit = {
    println
    for(r <- 0 until ar.length) {
      for(c <- 0 until ar.length) {
        print(ar(r)(c) + "\t")
      }
      println
    }
  }

}
