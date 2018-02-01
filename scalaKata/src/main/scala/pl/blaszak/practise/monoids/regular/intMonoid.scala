package pl.blaszak.practise.monoids.regular

import pl.blaszak.practise.monoids.Monoid

object intMonoid extends Monoid[Int] {

  override def add(x: Int, y: Int): Int = x + y
  override def unit: Int = 0
}
