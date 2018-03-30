package test

object Test {

  def testSamePackage() = println(x)

  def testWilcardImport(): Unit = {
    import Wildcard._
    println(x)
  }

  def testExplicitImport(): Unit = {
    import Explicit.x
    import Wildcard._
    println(x)
  }

  def testInlineDefinition(): Unit = {
    val x = "Lokalna definicja x"
    import Explicit.x
    import Wildcard._
    println(x)
  }

  def main(args: Array[String]): Unit = {
    testSamePackage()
    testWilcardImport()
    testExplicitImport()
    testInlineDefinition()
  }
}
