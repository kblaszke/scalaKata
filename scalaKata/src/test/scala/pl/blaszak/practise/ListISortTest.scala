package pl.blaszak.practise

import org.scalatest.FunSuite

class ListISortTest extends FunSuite {

  test("Isort Int test") {
    assert(ListISort.iSort(List(2, 3, 1, 7, 4, 8)) === List(1, 2, 3, 4, 7, 8))
  }

}
