package pl.blaszak.kata.string

/*
Sherlock considers a string, s, to be valid if either of the following conditions are satisfied:

1) All characters in  have the same exact frequency (i.e., occur the same number of times). For example, s="aabbcc" is
valid, but s="baacdd" is not valid.
2) Deleting exactly  character from  will result in all its characters having the same frequency. For example,
s="aabbccc" and s="aabbc are valid because all their letters will have the same frequency if we remove 1 occurrence of
c, but s=""abcccc is not valid because we'd need to remove 3 characters.
Given s, can you determine if it's valid or not? If it's valid, print YES on a new line; otherwise, print NO instead.

Input Format

A single string denoting s.

Constraints
1<=|s|<=10^5

String s consists of lowercase letters only (i.e., [a-z]).
Output Format

Print YES if string  is valid; otherwise, print NO instead.

Sample Input 0

aabbcd
Sample Output 0

NO
Explanation 0

We would need to remove two characters from s="aabbcd" to make it valid, because a and b both have a frequency of 2 and
c and d both have a frequency of 1. This means s is invalid because we'd need to remove more than 1 character to make
all its letters have the same frequency, so we print NO as our answer.
 */

object SherlockStringValidator {

  private def validString(input: String): Boolean = {
    val charCounts = input.distinct.map(c => input.count(e => e == c))
    charCounts.max == charCounts.min
  }

  private def validStringWithAdditionalChar(input: String): Boolean = {
    input.distinct.map(c => input.indexOf(c)).map(i => input.substring(0,i) + input.substring(i + 1)).find(s => validString(s)).isDefined
  }

  def valid(input: String): Boolean = {
    validString(input) || validStringWithAdditionalChar(input)
  }
}
