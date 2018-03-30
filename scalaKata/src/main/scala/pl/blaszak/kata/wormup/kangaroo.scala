package pl.blaszak.kata.wormup

import scala.annotation.switch

/*
You are choreograhing a circus show with various animals. For one act, you are given two kangaroos on a number line ready
to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location as part of the show.

Complete the function kangaroo which takes starting location and speed of both kangaroos as input, and return  or
appropriately. Can you determine if the kangaroos will ever land at the same location at the same time? The two kangaroos
must land at the same location after making the same number of jumps.

Input Format

4 space-separated integers
x1, v1, x2, v2: starting locations xroo and meters per jump vroo for kangaroos 1 and 2
Output Format

Print YES if they can land on the same location at the same time. Otherwise, print NO.

Sample Input 0

0 3 4 2
Sample Output 0

YES
Explanation 0

The two kangaroos jump through the following sequence of locations:

image

From the image, it is clear that the kangaroos meet at the same location (number  on the number line) after same number
of jumps ( jumps), and we print YES.

Sample Input 1

0 2 5 3
Sample Output 1

NO
Explanation 1

The second kangaroo has a starting location that is ahead (further to the right) of the first kangaroo's starting location (i.e., x2 > x1). Because the second kangaroo moves at a faster rate (meaning v2 > v1) and is already ahead of the first kangaroo, the first kangaroo will never be able to catch up. Thus, we print NO.
 */

object kangaroo {


  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var x1 = sc.nextInt();
    var v1 = sc.nextInt();
    var x2 = sc.nextInt();
    var v2 = sc.nextInt();
    if (kangaroo.willMeetTogether(x1, v1, x2, v2)) println("YES") else println("NO")
  }

  def willMeetTogether(x1: Int, v1: Int, x2: Int, v2: Int): Boolean = {
    if (!validInputs(x1, v1, x2, v2)) false else {
      val n = (x1 - x2).toDouble / (v2 - v1).toDouble
      if (n % 1 == 0) true else false
    }
  }

  private def validInputs(x1: Int, v1: Int, x2: Int, v2: Int): Boolean = if ((x1 < x2) && (v1 > v2) && positive(List(x1, x2, v1, v2))) true else false

  @switch
  private def positive(arguments: List[Int]): Boolean =  arguments match {
    case List() => false
    case arg :: Nil => if (arg >= 0) true else false
    case head :: tail => if (head < 0 ) false else positive(tail)
  }

}
