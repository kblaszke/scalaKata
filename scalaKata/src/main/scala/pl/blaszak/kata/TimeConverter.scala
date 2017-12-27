package pl.blaszak.kata

object TimeConverter {

  def timeConversion(s: String): String =  {
    val timeParts = s.split(":")
    var hour = timeParts(0).toInt
    val time = timeParts(2).substring(2)
    val second = timeParts(2).substring(0, 2)
    if (time.equals("PM") && hour < 12) {
      hour += 12
    } else if (time.equals("AM") && hour == 12) {
      hour -= 12
    }
    var hourString = ""
    if (hour < 10) {
      hourString = "0" + hour
    } else {
      hourString = hour.toString
    }
    hourString + ":" + timeParts(1) + ":" + second
  }

}
