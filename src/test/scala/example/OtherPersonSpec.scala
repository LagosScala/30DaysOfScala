package example

import org.scalatest.flatspec.AnyFlatSpec

class OtherPersonSpec extends AnyFlatSpec {
  val detail: (String, Int, Int, Gender) = ("Michael", 12, 1234567890, MALE)
  val person: OtherPerson = OtherPerson(detail._1, detail._2, detail._3, detail._4)

  "The Person class" should "create a new Person" in {
    assert(person.toString == s"OtherPerson(${detail._1},${detail._2},${detail._3},${detail._4})")
  }

  // Check - https://docs.oracle.com/javase/tutorial/jndi/objects/serial.html
  it should "be serializable" in {
    assert(person.isInstanceOf[Serializable])
  }

  it should "return an Option of tuples when the unapply method is called" in {
    // Confirms the type as Option which could be Some or None
    assert(OtherPerson.unapply(person).isInstanceOf[Option[detail.type]])

    // Checks that the unapply contains what is in the person object e.g Some((Michael,12,123456789))
    assert(OtherPerson.unapply(person).contains(detail))
  }

  it should "check that its gender is valid(Gender enum)" in {
    assert(person.gender.isInstanceOf[Gender])
  }
}
