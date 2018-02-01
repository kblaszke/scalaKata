package pl.blaszak.practise.monoids.regular

import pl.blaszak.practise.monoids.Monoid

object stringMonoid extends Monoid[String] {

  override def add(x: String, y: String): String = x.concat(y)
  override def unit: String = ""

}
