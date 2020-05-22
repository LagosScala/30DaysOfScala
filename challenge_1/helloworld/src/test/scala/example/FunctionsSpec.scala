package example

import  org.scalatest.WordSpec

class FunctionsSpec extends WordSpec{

  "The max function should return the highest value between two integers" in {
      val highest = Functions.max(8,3)
      assert(highest == 8)
  }

  "The powerOfTwo should multiply the value by itself" in {
      val power = Functions.powerOfTwo(3)
      assert(power == 9)
  }

  "The isOddNumber should find check an integers if its an Odd number" in{
      val oddNumber = Functions.isOddNumber(9)
      assert(oddNumber == true)
  }

  "The IntMultiples should give a list of multiples numbers of an integer" in {
      val multiple = Functions.intMultiples(2)
      assert(multiple == List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20))
  }
    ""

}