package example

import org.scalatest.WordSpec

class FunctionSpec extends WordSpec{

  "The max function should return the highest value between two integers" in {
    val highest = Function.max(3, 8)
    assert(highest == 8)
  }

  "The powerOfTwo function should multiply the value by itself" in {
    val power = Function.powerOfTwo(4)
    assert(power == 16)
  }

  "The isOddNumber function should check if given integer is ODD" in {
    val isOdd = Function.isOddNumber(3)
    assert(isOdd)
  }

  "The intMultiples function should return the list of multiples of an integer between 1 and 50" in {
    val multiples = Function.intMultiples(6)
    assert(multiples == List(6, 12, 18, 24, 30, 36, 42, 48))
  }
}
