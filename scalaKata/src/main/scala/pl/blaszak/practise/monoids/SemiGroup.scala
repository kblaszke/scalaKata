package pl.blaszak.practise.monoids

abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}
