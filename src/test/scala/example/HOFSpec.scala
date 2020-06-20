package example

import org.scalatest.flatspec.AnyFlatSpec

class HOFSpec extends AnyFlatSpec {
  val ints = List(1, 2, 3, 4, -5)
  
  "The HOF object" should "return the sum of an integer list" in {
    assert(HOF.sum(ints) == 5)
  }

  it should "return the index of the first negative element" in {
    assert(HOF.getNegativeIndex(ints).get == 4)
  }

  it should "return an Empty/None value if no negative element exist" in {
    assert(HOF.getNegativeIndex(List()).isEmpty)
  }
}
