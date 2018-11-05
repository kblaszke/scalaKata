package pl.blaszak.kata.implementation

import org.scalatest.FunSuite

class johnAndAnnSignCodewarsTest extends FunSuite {

  test("testAnn") {
    println(johnAndAnnSignCodewars.ann(5).reverse)
  }

  test("testJohn") {
    println(johnAndAnnSignCodewars.john(10).reverse)
  }
}
