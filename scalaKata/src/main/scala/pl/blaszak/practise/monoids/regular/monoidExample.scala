package pl.blaszak.practise.monoids.regular

import pl.blaszak.practise.monoids.Monoid

object monoidExample {

  def main(args: Array[String]): Unit = {
    val strings = List("a", "bc", "def")
    println(strings)
    println(sum(strings)(stringMonoid))

    val integers = List(1, 2, 3)
    println(integers)
    println(sum(integers)(intMonoid))
  }

  def sum[A](xs: List[A])(m: Monoid[A]): A = {
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail)(m))
  }
}
