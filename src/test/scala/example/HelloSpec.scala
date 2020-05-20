package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say have welcome message" in {
    Hello.greeting shouldEqual "Welcome to 30 days of Scala"
  }
}
