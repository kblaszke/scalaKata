package pl.blaszak.kata
/*
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1
Sample Output

0.500000
0.333333
0.166667
Explanation

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array.
The respective fractions of positive numbers, negative numbers and zeroes are 3/6=0.500000, 2/6=0.333333 and 1/6=0.166667, respectively.
 */
object PlusMinusCalculator {

  def calculate(arr: Array[Int]): Array[Double] = {
    var positiveNumbers = 0D
    var negativeNumbers = 0D
    var zeroNumbers = 0D
    arr.foreach(f => if(f<0){negativeNumbers += 1}else if(f>0){positiveNumbers += 1}else{zeroNumbers += 1})
    Array(positiveNumbers/arr.length, negativeNumbers/arr.length, zeroNumbers/arr.length)
  }

}
