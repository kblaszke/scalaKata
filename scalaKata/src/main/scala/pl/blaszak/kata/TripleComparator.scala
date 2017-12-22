package pl.blaszak.kata

/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale
from  to  for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison points by comparing  with ,  with , and  with .

If , then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Comparison points is the total points a person earned.

Given  and , can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains  space-separated integers, , , and , describing the respective values in triplet .
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

Constraints

1 <= ai <= 100
1 <= bi <= 100

Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

Sample Input

5 6 7
3 6 10
Sample Output

1 1
Explanation

In this example:
A = (a0, a1, a2) = (5, 6, 7)
B = (b0, b1, b2) = (3, 6, 10)

Now, let's compare each individual score:

a0 > b0, so Alice receives 1 point.
a1 == b1, so nobody receives a point.
a2 < b2, so Bob receives 1 point.
Alice's comparison score is , and Bob's comparison score is . Thus, we print 1 1 (Alice's comparison score followed by
Bob's comparison score) on a single line.
 */

object TripleComparator {

  def compare(firstLine: String, secondLine: String): String = {
    val firstRating = firstLine.split(" ")
    val secondRating = secondLine.split(" ")
    var firstSum = 0
    var secondSum = 0
    for(i <- 0 to 2) {
      if(Integer.parseInt(firstRating(i)) > Integer.parseInt(secondRating(i))) {
        firstSum += 1
      } else if(Integer.parseInt(firstRating(i)) < Integer.parseInt(secondRating(i))) {
        secondSum += 1
      }
    }
    firstSum + " " + secondSum
  }
}
