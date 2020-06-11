package example

import org.scalatest.flatspec.AnyFlatSpec

class LangSpec extends AnyFlatSpec {
  "The Lang object" should "return the toString value of a matched object" in {
    assert(Lang.matchLang(Scala) == "Scala")
  }

  it should "return 'default' message for an unknown Lang" in {
    assert(Lang.matchLang("Yolang") == "A language from Mars :)")
  }
}
