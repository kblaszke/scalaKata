package pl.blaszak.practise.vector2d

object Main {

  def main(args: Array[String]): Unit = {
    val x = new Vector2D(1.0, 1.0)
    val y = new Vector2D(-1.0, 1.0)
    println(x.magnify(3.0) - (x - y).magnify(3.0))
  }
}
