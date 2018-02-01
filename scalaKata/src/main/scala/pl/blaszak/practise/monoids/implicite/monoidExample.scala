package pl.blaszak.practise.monoids.implicite

import pl.blaszak.practise.monoids.Monoid

object monoidExample {

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A = {
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail)(m))
  }

  implicit object intMonoid extends Monoid[Int] {

    override def add(x: Int, y: Int): Int = x + y
    override def unit: Int = 0
  }

  implicit object stringMonoid extends Monoid[String] {
    override def add(x: String, y: String): String = x.concat(y)
    override def unit: String = ""
  }

  def main(args: Array[String]): Unit = {
    val strings = List("a", "bc", "def")
    println(strings)
    println(sum(strings))

    val integers = List(1, 2, 3)
    println(integers)
    println(sum(integers))
  }


}
