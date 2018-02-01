package pl.blaszak.practise.Example

case class Employee(id: Int, name: String, managerId: Int) {

  lazy val manager: Employee = Db.get(managerId)
  lazy val team: List[Employee] = Db.team(id)
}
