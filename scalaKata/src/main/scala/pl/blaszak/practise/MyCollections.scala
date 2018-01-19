package pl.blaszak.practise

object MyCollections {

  def main(args: Array[String]): Unit = {
    def theList = List(1, 2, 3, 4, 5)
    theList.reverse.foreach(x => println(x))
    // theList.foreach(x => println(x))
    println("1: " + primePairs1(8))
    println("2: " + primePairs2(8))
  }

  def isPrime(n: Int) =
    List.range(2, n) forall (x => n % x != 0)

  def primePairs1(n: Int) = {
    for { i <- List.range(1, n)
          j <- List.range(1, i)
          if isPrime(i+j) } yield (i, j)
  }

  def primePairs2(n: Int) = {
    List.range(1, n).flatMap(i => List.range(1, i).filter(j => isPrime(i + j)).map(j => (i, j)) )
  }
}
