package pl.blaszak.practise

object tmp {

  def createErrorMessage(errorCode: Int): String = errorCode match {
    case 1 => "Blad sieci"
    case 2 => "Blad we/wy"
    case 3 => "Nieznany blad"
  }

  def main(args: Array[String]): Unit = {

  }
}
