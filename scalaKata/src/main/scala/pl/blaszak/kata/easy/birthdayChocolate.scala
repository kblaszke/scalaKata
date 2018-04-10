package pl.blaszak.kata.easy

/*
Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it.
She decides to share a contiguous segment of the bar selected such that the length of the segment mathches Ron's birth
month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can
divide the chocolate.

Consider the chocolate bar as an array of squares, s = [2, 2, 1, 3, 2]. She wants to find segments summing to Ron's birth
day, d = 4 with a length equalling his birth month, m = 2. In this case, there are two segments meeting her criteria: [2, 2] and [1, 3].

Input Format

Complete the function  in the editor below. Input is read and passed to the function as follows:

The first line contains an integer , the number of squares in the chocolate bar.
The second line contains  space-separated integers , the numbers on the chocolate squares where .
The third line contains two space-separated integers,  and , Ron's birth day and his birth month.

Constraints
1 <= n <= 100
1 <= s[i] <= 5, where (0 <= i <= n)
1 <= d <= 31
1 <= m <= 12

Output Format

Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

Sample Input 0

5
1 2 1 3 2
3 2
Sample Output 0

2

Explanation 0

Lily wants to give Ron  squares summing to . The following two segments meet the criteria:
s[0] + s[1] = 1 + 2 = 3 and s[1] + s[2] = 2 + 1 = 3

Sample Input 1

6
1 1 1 1 1 1
3 2
Sample Output 1

0
Explanation 1

Lily only wants to give Ron  consecutive squares of chocolate whose integers sum to . There are no possible pieces
satisfying these constraints

Thus, we print  as our answer.

Sample Input 2

1
4
4 1
Sample Output 2

1
Explanation 2

Lily only wants to give Ron m = 1 square of chocolate with an integer value of d = 4. Because the only square of chocolate
in the bar satisfies this constraint, we print 1 as our answer.
 */

object birthdayChocolate {

  def solve(s: Array[Int], day: Int, mouth: Int): Int = 0.to(s.length - mouth).map(i => s.slice(i, i + mouth)).count(_.sum == day)

}
