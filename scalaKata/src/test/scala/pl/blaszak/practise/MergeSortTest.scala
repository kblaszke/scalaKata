package pl.blaszak.practise

import org.scalatest.FunSuite

class MergeSortTest extends FunSuite {

  test("Should sort Integer List") {
    // given
    val intList = List(3, 4, 1, 5, 2)
    assert(MergeSort.intSort(intList) === List(1, 2, 3, 4, 5))
  }

  test("Should reverse sort Integer List") {
    // given
    val intList = List(3, 4, 1, 5, 2)
    assert(MergeSort.reverseSort(intList) === List(5, 4, 3, 2, 1))
  }

}
