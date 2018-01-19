package pl.blaszak.practise

class Compartment(left: Int = 0, right: Int = 0) {

  def getLeft: Int = left
  def getRight: Int = right

  def == (compartment: Compartment): Boolean = {
    left == compartment.getLeft && right == compartment.getRight
  }
}
