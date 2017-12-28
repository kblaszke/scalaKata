package pl.blaszak.kata.wormup

/*
Consider a staircase of size n=4:

   #
  ##
 ###
####
Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line
is not preceded by any spaces.

Write a program that prints a staircase of size n.

Input Format

A single integer, n, denoting the size of the staircase.

Output Format

Print a staircase of size n using # symbols and spaces.

Note: The last line must have 0 spaces in it.

Sample Input

6
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.
 */

object StairCase {

  def printStairs(n: Int): Unit = {
    for (space <- n - 1 to 0 by -1) {
      printChars(space, ' ')
      printChars(n - space, '#')
      println()
    }
  }

  def printChars(n: Int, letter: Char): Unit = {
    for (i <- 0 until n) {
      print(letter)
    }
  }

}
