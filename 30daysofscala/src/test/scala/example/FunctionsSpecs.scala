package example

import org.scalatest.WordSpec

class FunctionsSpecs extends WordSpec {

  "The max function should return the highest value between two integers" in {
    val highest = Functions.max(5, 2)
    assert(highest == 5)
  }
  "The powerOTwo should multiply the value by itself" in {
    val power = Functions.powerOfTwo(4)
    assert(power == 16)
  }

  "Odd number should return a boolean value of true" in {
    val isOdd = Functions.isOddNumber(3)
    assert(isOdd == true)
  }

  "Is multiple of the integer number enter" in {
    val multipleList = Functions.intMultiples(5)
    assert(multipleList == List(0, 2, 4, 6, 8))
  }
}
