package pl.blaszak.practise

package object complex {
  val i = new ComplexNumber(0.0, 1.0)
  implicit def realToComplex(r: Double): ComplexNumber = new ComplexNumber(r, 0.0)
}
