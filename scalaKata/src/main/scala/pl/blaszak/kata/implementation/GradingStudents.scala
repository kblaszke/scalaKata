package pl.blaszak.kata.implementation

object GradingStudents {

  private def grade(g: Int): Int = {
    var result = g
    if (g > 37) {
      val upperGrade = (g/5 + 1) * 5
      if ((upperGrade - g) < 3) {
        result = upperGrade
      }
    }
    result
  }

  def grade(grades: Array[Int]): Array[Int] = {
    grades.map(g => grade(g))
  }

}
