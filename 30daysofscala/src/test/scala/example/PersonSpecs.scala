package example

import org.scalatest._

class PersonSpecs extends FunSpec {
  describe("print") {
    it("My name is mmk, am 31 years of age,am from rome") {
      val person = Person("mmk", 31, "rome")
      assert(person.print === "My name is mmk, am 31 years of age,am from rome")
    }
  }

}
