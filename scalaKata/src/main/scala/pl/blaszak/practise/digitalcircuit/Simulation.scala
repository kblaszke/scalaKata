package pl.blaszak.practise.digitalcircuit

import org.slf4j.LoggerFactory

abstract class Simulation {

  val logger = LoggerFactory.getLogger(classOf[Simulation])

  type Action = () => Unit

  case class Event(time: Int, action: Action)

  private var curtime = 0
  def currentTime: Int = curtime

  private var agenda: List[Event] = List()

  private def insert(ag: List[Event], item: Event): List[Event] = ag match {
    case first :: rest if first.time <= item.time => first :: insert(rest, item)
    case _ => item :: ag
  }

  def afterDelay(delay: Int)(block: => Unit): Unit = {
    val item = Event(curtime + delay, () => block)
    agenda = insert(agenda, item)
  }

  def run(): Unit = {
    afterDelay(0) (
      logger.info("*** simulator pre started, time = " + curtime + " ***")
    )
    loop()
  }

  def loop(): Unit = agenda match {
    case first :: rest =>
      agenda = rest
      curtime = first.time
      first.action
      loop()
    case Nil =>
  }

}
