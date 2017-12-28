package pl.blaszak.kata.implementation.timeinwords

import pl.blaszak.kata.implementation.timeinwords.mixers.{MixerAbstract, PastMixer, ToMixer, ZeroMinutesMixer}

/*
Given the time in numerals we may convert it into words, as shown below:

5:01 === "one minute past five"
5:10 === "ten minutes past five"
5:15 === "quarter past five"
5:30 === "half past five"
5:28 === "twenty eight minutes past five"
5:40 === "twenty minutes to six"
5:45 === "quarter to six"
5:47 === "thirteen minutes to six"

Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints
1<=H<=12
1<=M<=60

Output Format

Display the time in words.

Sample Input

5
47
Sample Output

thirteen minutes to six
 */

object TheTimeInWords {

  val numberToWordMap = Map(
    0 -> "o' clock",
    1 -> "one",
    2 -> "two",
    3 -> "three",
    4 -> "four",
    5 -> "five",
    6 -> "six",
    7 -> "seven",
    8 -> "eight",
    9 -> "nine",
    10 -> "ten",
    11 -> "eleven",
    12 -> "twelve",
    13 -> "thirteen",
    14 -> "fourteen",
    15 -> "quarter",
    16 -> "sixteen",
    17 -> "seventeen",
    18 -> "eighteen",
    19 -> "nineteen",
    20 -> "twenty",
    30 -> "half"
  )

  def convert(h: Int, m: Int): String = {
    var hour = ""
    if (m > 30) {
      hour = numberToWordMap(h + 1)
    } else {
      hour = numberToWordMap(h)
    }
    val mixer = mixerFactoryMethod(m)
    mixer.mix(hour, m)
  }

  def mixerFactoryMethod(m: Int): MixerAbstract = {
    if (m == 0) {
      new ZeroMinutesMixer(numberToWordMap)
    } else if (m > 30) {
      new ToMixer(numberToWordMap)
    } else {
      new PastMixer(numberToWordMap)
    }
  }

}
