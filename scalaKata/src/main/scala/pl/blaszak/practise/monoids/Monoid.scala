package pl.blaszak.practise.monoids

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}
