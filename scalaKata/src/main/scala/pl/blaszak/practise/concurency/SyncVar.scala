package pl.blaszak.practise.concurency

class SyncVar[A] {

  private var isDefined: Boolean = false
  private var value: A = _

  def get = synchronized {
    while(!isDefined) wait()
    value
  }

  def set(x: A) = synchronized {
    value = x
    isDefined = true
    notifyAll()
  }

  def isSet: Boolean = synchronized {
    isDefined
  }

  def unset = synchronized {
    isDefined = false
  }

}
