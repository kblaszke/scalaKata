package pl.blaszak.practise.vector2d

class Vector2D(var x: Double, var y: Double){
  def magnify(amt: Double): Vector2D = {
    x *= amt
    y *= amt
    this
  }

  def -(vec: Vector2D): Vector2D = {
    x -= vec.x
    y -= vec.y
    this
  }

  override def toString: String = {
    "(" + x + "," + y + ")"
  }
}
