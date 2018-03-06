package pl.blaszak.practise.concurency

import collection.mutable.{HashMap => MutableHashMap}

class MutableService extends Service[Int, Int] {
  val currentIndex = new MutableHashMap[Int, Int]
  override def lookup(k: Int): Option[Int] = synchronized(currentIndex.get(k))
  override def insert(k: Int, v: Int): Unit = synchronized(currentIndex.put(k, v))
}

