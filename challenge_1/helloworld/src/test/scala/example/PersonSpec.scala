package example

import org.scalatest._

class PersonSpec extends FunSpec {

    it("returns true if an instance of a case class is true") {
        val person = Person.Person("Sayo", 99, 1234567890)
        assert( person.isInstanceOf[Serializable] == true)

    }

    it("returns tuples when unapply method is called on a case object") {
        val person = Person.Person("Sayo", 99, 1234567890)
        assert( Person.Person.unapply(person).isInstanceOf[Tuple3[String, Int, Long]] == true)
    }

}