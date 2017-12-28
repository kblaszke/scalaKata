package pl.blaszak.kata.implementation.timeinwords.mixers

import java.util.NoSuchElementException

abstract class MixerAbstract(numberToWordMap: Map[Int, String]) extends Mixer {

  protected def getMinutesString(m: Int): String = {
    var result = ""
    try {
      result = numberToWordMap(m)
    } catch {
      case _: NoSuchElementException => result = numberToWordMap(20) + " " + numberToWordMap(m - 20)
    }
    result + " "
  }

  protected def getTimeUnits(m: Int): String = {
    var result = ""
    if (m == 1) {
      result = "minute "
    } else if (m != 15 && m != 30) {
      result = "minutes "
    }
    result
  }
}
