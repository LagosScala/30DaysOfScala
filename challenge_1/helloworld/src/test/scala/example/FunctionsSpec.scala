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
      val multiple = Functions.intMultiples(2, 0, 50)
      assert(multiple == List(0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100))
  }


}