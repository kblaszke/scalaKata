package pl.blaszak.kata.implementation.timeinwords.mixers

class PastMixer(numberToWordMap: Map[Int, String]) extends MixerAbstract(numberToWordMap) {

  override def mix(hour: String, m: Int): String = {
    getMinutesString(m) + getTimeUnits(m) + "past " + hour
  }
}
