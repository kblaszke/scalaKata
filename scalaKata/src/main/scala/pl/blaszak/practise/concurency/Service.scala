package pl.blaszak.practise.concurency

trait Service[Key, Value] {
  def lookup(k: Key): Option[Value]
  def insert(k: Key, v: Value): Unit
}
