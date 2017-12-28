package pl.blaszak.kata.implementation.timeinwords

import pl.blaszak.kata.implementation.timeinwords.mixers.{MixerAbstract, PastMixer, ToMixer, ZeroMinutesMixer}

object TheTimeInWords {

  val numberToWordMap = Map(
    0 -> "o' clock",
    1 -> "one",
    2 -> "two",
    3 -> "three",
    4 -> "four",
    5 -> "five",
    6 -> "six",
    7 -> "seven",
    8 -> "eight",
    9 -> "nine",
    10 -> "ten",
    11 -> "eleven",
    12 -> "twelve",
    13 -> "thirteen",
    14 -> "fourteen",
    15 -> "quarter",
    16 -> "sixteen",
    17 -> "seventeen",
    18 -> "eighteen",
    19 -> "nineteen",
    20 -> "twenty",
    30 -> "half"
  )

  def convert(h: Int, m: Int): String = {
    var hour = ""
    if (m > 30) {
      hour = numberToWordMap(h + 1)
    } else {
      hour = numberToWordMap(h)
    }
    val mixer = mixerFactoryMethod(m)
    mixer.mix(hour, m)
  }

  def mixerFactoryMethod(m: Int): MixerAbstract = {
    if (m == 0) {
      new ZeroMinutesMixer(numberToWordMap)
    } else if (m > 30) {
      new ToMixer(numberToWordMap)
    } else {
      new PastMixer(numberToWordMap)
    }
  }

}
