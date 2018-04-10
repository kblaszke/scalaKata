package pl.blaszak.kata.easy

/*
Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During
his last hike, he took exactly n steps. For every step he took, he noted if it was an uphill, U, or a downhill, D step.
Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude. We define the
following terms:

- A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with
  a step down to sea level.
- A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with
  a step up to sea level.

Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

For example, if Gary's path is s=[DDUUUUDD], he first enters a valley 2 units deep. Then he climbs out an up onto a mountain
units high. Finally, he returns to sea level and ends his hike.

Input Format

Complete the function countingValley in the editor below. The code stub reads the input at passes it to the function.
Inputs are in the following format:

The first line contains an integer , the number of steps in Gary's hike.
The second line contains a single string , of  characters describing his path.

Constraints
2 <= n <= 10^6
s[i] = {U,D}

Output Format

Print a single integer denoting the number of valleys Gary walked through during his hike.

Sample Input

8
UDDDUDUU
Sample Output

1
Explanation

If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

_/\      _
   \    /
    \/\/
He enters and leaves one valley.
 */

import scala.annotation.{switch, tailrec}

object countingValleys {

  @tailrec
  def solve(s: List[Char], level: Int = 0, acc: Int = 0): Int = s match {
    case Nil => acc
    case head :: tail => {
      val newLevel = level + direction(head)
      solve(tail, newLevel, acc + valleyDetect(level, newLevel))
    }
  }

  private def valleyDetect(oldLevel: Int, newLevel: Int): Int = (oldLevel, newLevel) match {
    case (-1, 0) => 1
    case _ => 0
  }

  @switch
  private def direction(c: Char): Int = c match {
    case 'D' => -1
    case 'U' => 1
    case _ => 0
  }
}
