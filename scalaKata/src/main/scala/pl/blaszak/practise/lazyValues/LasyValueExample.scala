package pl.blaszak.practise

import pl.blaszak.practise.Example.Db

object LasyValueExample {
  def main(args: Array[String]): Unit = {
    val employee = Db.get(1)
    Db.team(employee.managerId).foreach(println(_))
  }
}
