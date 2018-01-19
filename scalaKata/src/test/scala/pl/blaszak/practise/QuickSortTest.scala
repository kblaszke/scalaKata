package pl.blaszak.practise

import org.scalatest.FunSuite

class QuickSortTest extends FunSuite {

  test("Sample array sort") {
    assert(QuickSort.sort(Array(3, 2, 4, 5, 1, 7, 6)) === Array(1, 2, 3, 4, 5, 6, 7))
  }

}
