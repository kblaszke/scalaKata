package pl.blaszak.practise.Example

object Db {
  val table = Map(1 -> (1, "Haruki Murakami", 1),
    2 -> (2, "Milan Kundera", 1),
    3 -> (3, "Jeffrey Eugenides", 1),
    4 -> (4, "Mario Vargas Llosa", 1),
    5 -> (5, "Julian Barnes", 2))

  def get(id: Int): Employee = recToEmployee(table(id))

  def recToEmployee(rec: (Int, String, Int)): Employee = {
    println("[db] fetching " + rec._1)
    Employee(rec._1, rec._2, rec._3)
  }

  def team(id: Int): List[Employee] = {
    for (rec <- table.values.toList; if rec._3 ==  id) yield recToEmployee(rec)
  }
}
