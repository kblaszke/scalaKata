package pl.blaszak.practise.concurency

import collection.immutable.{HashMap => InmutableHashMap}

class InmutableService extends Service[Int, Int] {
  var currentIndex = new InmutableHashMap[Int, Int]
  override def lookup(k: Int): Option[Int] = currentIndex.get(k)
  override def insert(k: Int, v: Int): Unit = synchronized(currentIndex = currentIndex + ((k, v)))
}
