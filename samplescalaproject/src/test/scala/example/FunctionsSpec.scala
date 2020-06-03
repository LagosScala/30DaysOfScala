package example

import org.scalatest.WordSpec



class FunctionsSpecs extends WordSpec {

    "The max function should return the highest value between two integers" in {
        val highest = Functions.max(8,3)
        assert(highest == 8)
    }

    "The powerOfTwo should multiply the value by itself" in {
        val power = Functions.powerOfTwo(3)
        assert(power == 9)
    }

    "The function isOddNumber should return true if integer x is an ODD number otherwise should return false" in {
        val x = Functions.isOddNumber(5)
        assert(x == true)

    }

    "The intMultiples should take an integer number and return a list of multiples of that number" in {
        val multiplesOf = Functions.intMultiples(2)
        assert(multiplesOf == List(2,4,6,8,10,12,14,16,18))
    }

      

       
      }
            





