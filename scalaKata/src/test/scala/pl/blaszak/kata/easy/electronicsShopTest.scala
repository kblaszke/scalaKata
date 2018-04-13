package pl.blaszak.kata.easy

import org.scalatest.FunSuite

class electronicsShopTest extends FunSuite {

  test("testGetMoneySpent 1") {
    val keyboards = Array(3, 1)
    val usbs = Array(5, 2, 8)
    val b = 10
    assert(electronicsShop.getMoneySpent(keyboards, usbs, b) === 9)
  }

  test("testGetMoneySpent 2") {
    val keyboards = Array(4)
    val usbs = Array(5)
    val b = 5
    assert(electronicsShop.getMoneySpent(keyboards, usbs, b) === -1)
  }

}
