package pl.blaszak.kata

import scala.annotation.tailrec

object nonDivisibleSubset {

  @tailrec
  def createAllPermutations(s: List[Int], acc: List[(Int, Int)] = Nil): List[(Int, Int)] = s match {
    case Nil => acc
    case head :: tail => createAllPermutations(tail, acc ++ tail.map(e => (head, e)))
  }

  @tailrec
  def numbersToDelete(divisiblePermutations: List[(Int, Int)], acc: List[Int] = Nil): List[Int] = {
    if(divisiblePermutations.isEmpty) acc else {
      val worstNumber = divisiblePermutations.flatMap(p => List(p._1, p._2)).groupBy(identity).maxBy(_._2.size)._1
      val permutationsWithDeletedWorstNumber = divisiblePermutations.filter(p => p._1 != worstNumber && p._2 != worstNumber)
      numbersToDelete(permutationsWithDeletedWorstNumber, worstNumber :: acc)
    }
  }

  def nonDivisibleSubset(k: Int, s: List[Int]): Int = {
    val divisiblePermutations = createAllPermutations(s).filter(p => (p._1 + p._2).toDouble % k == 0)
    s.size - numbersToDelete(divisiblePermutations).size
  }
}
