package pl.blaszak.practise

object optionExample {

  def sayHello(username: Option[String]): Unit = {
    for(name <- username) {
      println("Hello " + name + "!")
    }
  }


  def authenticateSession(username: Option[String], password: Option[String]): Unit = {
    for(u <- username; p <- password; if canAuthenticate(u, p)) {
      val privileges = privilegesFor(u)
      injectPrivilegesIntoSession(privileges)
    }
  }

  def main(args: Array[String]): Unit = {
    sayHello(Option.empty)
    sayHello(Option("Blaszak"))

    authenticateSession(Option.empty, Option.empty)
    authenticateSession(Option("Admin"), Option.empty)
    authenticateSession(Option("Admin"), Option("Admin1"))
  }

  def canAuthenticate(userName: String, password: String): Boolean = if ("Admin".equals(userName) && "Admin1".equals(password)) true else false

  def privilegesFor(name: String) = new Privileges(name)

  def injectPrivilegesIntoSession(privileges: Privileges): Unit = {
    println("fake method for inject privileges into session for: " + privileges.getUserName() + ", at level: " + privileges.level)
  }

  class Privileges(userName: String) {
    def level = "developer"
    def getUserName(): String = userName
  }
}
