package pl.blaszak.practise

object StreamExamples {

  def main(args: Array[String]): Unit = {
    val list = List(3, 4, 5, 6)
    Stream.cons(2, list.toStream).foreach(e => println("Blaszak: " + e))
    Stream.range(1000, 1050) filter isPrime
  }

  def isPrime(n: Int) =
    Stream.range(2, n) forall (x => n % x != 0)
}
