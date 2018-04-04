package pl.blaszak.practise.complex

class ComplexNumber(real: Double, immaginary: Double) {

  def getReal: Double = real
  def getImmaginary: Double = immaginary

  def *(other: ComplexNumber): ComplexNumber = new ComplexNumber((real * other.getReal) - (immaginary * other.getImmaginary),
    (real * other.getImmaginary) + (immaginary * other.getReal))

  def +(other: ComplexNumber): ComplexNumber = new ComplexNumber(real + other.getReal, immaginary + other.getImmaginary)

  def -(other: ComplexNumber): ComplexNumber = new ComplexNumber(real - other.getReal, immaginary - other.getImmaginary)
}
