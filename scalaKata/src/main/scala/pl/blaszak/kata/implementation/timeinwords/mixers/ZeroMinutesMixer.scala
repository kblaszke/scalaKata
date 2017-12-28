package pl.blaszak.kata.implementation.timeinwords.mixers

class ZeroMinutesMixer(numberToWordMap: Map[Int, String]) extends MixerAbstract(numberToWordMap) {
  override def mix(hour: String, m: Int): String = {
    hour + " " + numberToWordMap(0)
  }
}
