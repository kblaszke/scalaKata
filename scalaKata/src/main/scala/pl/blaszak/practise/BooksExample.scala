package pl.blaszak.practise

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference.Elements

object BooksExample {

  val books: List[Book] = List(
    Book("Structure and Interpretation of Computer Programs",
      List("Abelson, Harold", "Sussman, Gerald J.")),
    Book("Principles of Compiler Design", List("Aho, Alfred", "Ullman, Jeffrey")),
    Book("Programming in Modula2", List("Wirth, Niklaus")),
    Book("Introduction to Functional Programming", List("Bird, Richard", "Ullman, Jeffrey")),
    Book("The Java Language Specification",
      List("Gosling, James", "Joy, Bill", "Steele, Guy", "Bracha, Gilad")))



  def main(args: Array[String]): Unit = {
    println("All books of Ullman:")
    println(findAllAuthorsBooks("Ullman"))

    println("Books with title with <<Program>>:")
    println(findAllTitlesWithWord("Program"))

    println("Authors od at last two books:")
    println(removeDuplicates(authorsAtLastTwoBooks()))
  }

  def findAllTitlesWithWord(str: String): Any = {
    for(b <- books if (b.title indexOf str) >= 0) yield b.title
  }

  def findAllAuthorsBooks(author: String): List[String] = {
    for(b <- books; a <- b.authors if a startsWith author) yield b.title
  }

  def authorsAtLastTwoBooks(): List[String] = {
    for(b1 <- books; b2 <- books if b1 != b2; a1 <- b1.authors; a2 <- b2.authors if a1 == a2) yield a1
  }

  def removeDuplicates(xs: List[String]): List[String] = {
    if(xs isEmpty) xs
    else xs.head :: removeDuplicates(for(x <- xs.tail if x != xs.head) yield x)
  }
}
