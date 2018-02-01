package pl.blaszak.practise

object ImplicitMergeSort {

  /*implicit def int2ordered(x: Int): Ordered[Int] = new Ordered[Int]{
    def compare(y: Int): Int =
      if(x < y) -1
      else if(x > y) 1
      else 0
  }*/

  def sort[A](xs: List[A])(implicit c: A => Ordered[A]): List[A] = {
    if(xs.isEmpty || xs.tail.isEmpty) xs
    else {
      val (ys, zs) = xs.splitAt(xs.length/2)
      merge(ys, zs)
    }
  }

  def merge[A](xs: List[A], ys: List[A])(implicit c: A => Ordered[A]): List[A] = {
    if(xs.isEmpty) ys
    else if(ys.isEmpty) xs
    else if(c(xs.head) < ys.head) xs.head :: merge(xs.tail, ys)
    else ys.head :: merge(xs, ys.tail)(c)
  }

  def main(args: Array[String]): Unit = {
    val integers = List(3, 2, 4, 1, 5)
    val myVal: Int = 4
    println(sort(integers))
  }

}
