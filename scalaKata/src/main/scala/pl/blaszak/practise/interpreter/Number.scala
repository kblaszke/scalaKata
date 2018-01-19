package pl.blaszak.practise.interpreter

case class Number(n: Int) extends Expr {
  override def eval: Int = n

  override def print: Unit = Console.print(n)

}
