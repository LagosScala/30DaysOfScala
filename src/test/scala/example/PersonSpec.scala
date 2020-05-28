package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonSpec extends AnyFlatSpec with Matchers {
  val (name, age, nationality) = ("Michael", 12, "Nigerian")
  val expectedString = s"Hi. I am [$name] from [$nationality], and I am [$age] years old!"

  "The Person class" should "create a person" in {
    assert(new Person(name, age, nationality).toString == expectedString)
  }

  it should "create a person without the 'new' keyword" in {
    assert(Person(name, age, nationality).toString == expectedString)
  }

  it should "not allow negative age input" in {
    an [AssertionError] should be thrownBy {
      Person(name, -1, nationality) // an alien :(
    }
  }
}
