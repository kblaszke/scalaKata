package pl.blaszak.kata

/*This time no story, no theory. The examples below show you how to write function accum:

Examples:

Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.*/

object Accumul {

  def generateTail(char: Char, max: Int): String = {
    var result = ""
    for (i <- 0 to max-1) {
      result += char
    }
    result
  }

  def accum(word: String): String = {
    var result = ""
    for (i <- 0 to word.length-1) {
      val c = word.charAt(i)
      result += c.toUpper + generateTail(c.toLower, i) + "-"
    }
    result.substring(0, result.length - 1)
  }
}
