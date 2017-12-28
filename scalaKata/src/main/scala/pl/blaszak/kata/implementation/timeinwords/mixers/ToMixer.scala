package pl.blaszak.kata.implementation.timeinwords.mixers

class ToMixer(numberToWordMap: Map[Int, String]) extends MixerAbstract(numberToWordMap) {
  override def mix(hour: String, m: Int): String = {
    val minutesTo = 60 - m
    getMinutesString(minutesTo) + getTimeUnits(minutesTo) + "to " + hour
  }
}
