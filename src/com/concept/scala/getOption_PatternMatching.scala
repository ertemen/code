package com.concept.scala

object getOption_PatternMatching extends App {

  /**
    *
    * email is not mandatory
    *
    */
  class Person(val name: String, val age: Int, val email: Option[String]) {
    override def toString = s"Person($name, $age, $email)"
  }

  object Person { def apply(name: String, age: Int, email: Option[String]) = new Person(name, age, email) }

  object PersonDao {

    private val persons = Map(
      1 -> Person("John Snow", 25, Some("john.snow@winterfell.we")),
      2 -> Person("Tyrion Lannister", 30, Some("theimp@CasterlyRock.we")),
      3 -> Person("Sandor Clegane", 40, None))

    def findById(id: Int): Option[Person] = persons.get(id)
    def findAll = persons.values
  }

  /**
    *
    * return the name of p otherwise "N/A"
    * using only if, else and Option methods
    */
  def getName(p: Option[Person]): String =
  {
    if (p.isDefined)
      Option(p.get.name).get
    else
      "N/A"
  }

  /**
    *  Write the same function that below using only map and getOrElse
    */
  def getNameUsingMap(p: Option[Person]): String = {

  None.getOrElse(p.map(per=>per.name)).getOrElse("N/A")

  }

  /**
    *
    * return the email of the persons
    *
    * Watch out: email in already an Option[String]
    */
  def getEmail(p: Option[Person]): Option[String] = {

    None.getOrElse(p.map(per=>Option(per.email).getOrElse(None)).get)

  }

 println(getName(PersonDao.findById(2)))
  println(getNameUsingMap(PersonDao.findById(6)))
  println(getNameUsingMap(PersonDao.findById(2)))

  println(getEmail(PersonDao.findById(2)))
  println(getEmail(PersonDao.findById(3)))
  //println(getEmail(PersonDao.findById(4)))
}
