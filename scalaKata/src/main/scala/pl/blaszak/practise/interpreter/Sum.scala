package pl.blaszak.practise.interpreter

case class Sum(e1: Expr, e2: Expr) extends Expr {

  override def eval: Int = e1.eval + e2.eval

  override def print: Unit = {
    Console.print("(")
    e1.print
    Console.print(" + ")
    e2.print
    Console.print(")")
  }
}
