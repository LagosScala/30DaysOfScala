package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say Welcome to 30 days of Scala" in {
    Hello.greeting shouldEqual "Welcome to 30 days of Scala"
  }
}
