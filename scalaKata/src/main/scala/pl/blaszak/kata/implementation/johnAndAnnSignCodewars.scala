package pl.blaszak.kata.implementation

object johnAndAnnSignCodewars {

  def john(n: Long): List[Long] = n match {
    case 0 => List(0)
    case n => {
      val prevDays = john(n - 1)
      val newHead = n - ann(prevDays.head).head
      newHead :: prevDays
    }
  }

  def ann(n: Long): List[Long] = n match {
    case 0 => List(1)
    case n => {
      val prevDays = ann(n - 1)
      val newHead = n - john(prevDays.head).head
      newHead :: prevDays
    }
  }

}
