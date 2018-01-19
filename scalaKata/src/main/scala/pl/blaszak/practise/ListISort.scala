package pl.blaszak.practise

object ListISort {

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  def iSort(xs: List[Int]): List[Int] = xs match{
    case List() => List()
    case x :: xs1 => insert(x, iSort(xs1))
  }

}
