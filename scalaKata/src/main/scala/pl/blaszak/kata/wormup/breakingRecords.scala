package pl.blaszak.kata.wormup

/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the
number of times she breaks her season record for most points and least points in a game. Points scored in the first game
establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array . Scores are in the same order as the games
played. She would tabulate her results as follows:

                                 Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1
Given Maria's array of scores for a season of n games, find and print the number of times she breaks her records for most and
least points scored during the season.

Input Format

The first line contains an integer n, the number of games.
The second line contains n space-separated integers describing the respective values of
score0, score1, ..., scoreN-1.

Constraints
1 <= n <= 1000
0 <= scoreI <=10^8

Output Format

Print two space-separated integers describing the respective numbers of times her best (highest) score increased and her
worst (lowest) score decreased.

Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4
Explanation 0

She broke her best record twice (after games 2 and 7) and her worst record four times (after games 1, 4, 6, and 8), so
we print 2 4 as our answer. Note that she did not break her record for best score during game 3, as her score during that
game was not strictly greater than her best record at the time.

Sample Input 1

10
3 4 21 36 10 28 35 5 24 42
Sample Output 1

4 0
Explanation 1

She broke her best record four times (after games 1, 2, 3, and 9) and her worst record zero times (no score during the
season was lower than the one she earned during her first game), so we print 4 0 as our answer.
 */

import java.io.PrintWriter

import scala.annotation.tailrec

object breakingRecords {

  def breakingRecords(scores: List[Int]): Option[(Int, Int)] = {

    @tailrec
    def go(scores: List[Int], accMin: Int, accMax: Int, countMin: Int, countMax: Int): (Int, Int) = scores match {
      case Nil => (countMin, countMax)
      case head :: tail =>
        val minValues = solveValues((x, y) => x < y)(head, accMin, countMin)
        val maxValues = solveValues((x, y) => x > y)(head, accMax, countMax)
        go(tail, minValues._1, maxValues._1, minValues._2, maxValues._2)
    }

    def solveValues(f: (Int, Int) => Boolean)(value: Int, extreme: Int, count: Int): (Int, Int) = {
      if (f(value, extreme)) (value, count + 1) else (extreme, count)
    }

    scores match {
      case Nil => None
      case head :: tail => Some(go(tail, head, head, 0, 0))
    }
  }


  def main(args: Array[String]) {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = scan.readLine.trim.toInt

    val score = scan.readLine.split(" ").map(_.trim.toInt).toList
    val result = breakingRecords(score)

    result.foreach(r => fw.println(r._2 + " " + r._1))

    fw.close()
  }

}
