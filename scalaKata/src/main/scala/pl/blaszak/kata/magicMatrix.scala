package pl.blaszak.kata


object magicMatrix {

  def findMinimalCost(ar: Array[Array[Int]]): Int = {
    val magicArray = findMagicArray(ar)
    (ar.toList.flatMap(_.toList) zip magicArray.toList.flatMap(_.toList)).map(blaszak(_)).sum
  }

  def blaszak(t: (Int, Int)): Int = math.abs(t._2 - t._1)

  def findMagicArray(ar: Array[Array[Int]]): Array[Array[Int]] = {
    if(isMagicMatrix(ar)) ar else {
      val allVariations = createAllVariation(ar)
      val bestArray = (allVariations zip (allVariations.map(s => standardDeviation(allSums(s))))).min(Ordering.by((p: (Array[Array[Int]], Double)) => p._2))._1
      findMagicArray(bestArray)
    }
  }

  def createAllVariation(ar: Array[Array[Int]]): List[Array[Array[Int]]] = {
    allCoordinates(ar.length)
      .flatMap(point => List(-1,1).map(change => {
        val newAr = copyArr(ar)
        newAr(point._1)(point._2) = newAr(point._1)(point._2) + change
        newAr
        })).toList
  }
  def copyArr(ar: Array[Array[Int]]): Array[Array[Int]] = {
    0.until(ar.length).map(r => ar(r).clone).toArray
  }
  def allCoordinates(size: Int): Stream[(Int, Int)] = {
    0.until(size).flatMap(r => 0.until(size).map(c => (r, c)).toStream).toStream
  }
  def isMagicMatrix(ar: Array[Array[Int]]): Boolean = {
    if (standardDeviation(allSums(ar)) == 0) true else false
  }
  def standardDeviation(l: List[Int]): Double = {
    val avg = mean(l)
    math.sqrt(l.map(m => math.pow(m - avg, 2)).sum)
  }
  def mean(l: List[Int]): Double = l.sum/l.size
  def allSums(ar: Array[Array[Int]]): List[Int] = {
    upHillSum(ar) :: downHillSum(ar) :: 0.until(ar.length)
      .flatMap(m => List(colSum(ar, m), rowSum(ar, m)).toStream)
      .toList
  }
  // def colSum(ar: Array[Array[Int]], col: Int): Int = sum(ar)(i => (i, col))
  def colSum: ((Array[Array[Int]], Int) => Int) = (ar, c) => sum(ar)(i => (i, c))
  // def rowSum(ar: Array[Array[Int]], row: Int): Int = sum(ar)(i => (row, i))
  def rowSum: ((Array[Array[Int]], Int) => Int) = (ar, r) => sum(ar)(i => (r, i))
  def downHillSum(ar: Array[Array[Int]]): Int = sum(ar)(i => (i, i))
  def upHillSum(ar: Array[Array[Int]]): Int = sum(ar)(i => (i, ar.length - i - 1))
  def sum(ar: Array[Array[Int]])(f: Int => (Int, Int)): Int = {
    var sum = 0
    for(i <- 0 until ar.length) {
      val index = f(i)
      sum += ar(index._1)(index._2)
    }
    sum
  }
}
