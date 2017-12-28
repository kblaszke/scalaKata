package pl.blaszak.kata.wormup

/*

The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that
character appears only once in the original string, or ')' if that character appears more than once in the original
string. Ignore capitalization when determining if a character is a duplicate.

Examples:
"din" => "((("
"recede" => "()()()"
"Success" => ")())())"
"(( @" => "))(("

 */

object DuplicateEncoder {

  def encode(word: String): String = {
    def lowercaseWord = word.toLowerCase
    lowercaseWord.map(c => if (lowercaseWord.count(_ == c) > 1) ")" else "(").mkString
  }
}
