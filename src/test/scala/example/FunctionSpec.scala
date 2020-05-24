package example

import org.scalatest.WordSpec

class FunctionSpec extends WordSpec {

    "The isOddNumber method should return true if number is odd" in {
        val isOdd = Function.isOddNumber(5)
        assert(isOdd == true)
    }

    "The isOddNumber method should return false if number is even" in {
        val isOdd = Function.isOddNumber(208)
        assert(isOdd == false)
    }

    "The intMultiple method should return a list containing the right results" in {
        val multiples = Function.intMultiple(9)
        val result = List(18,27,36,45)
        assert(multiples == result)
    }

    "The intMultiple method should return an empty list if user enters 0" in {
        val multiples = Function.intMultiple(0)
        val result = List.newBuilder[Int].result()
        assert(multiples == result)
    }
    "The intMultiple method should return an empty list when user enters 50 or above" in {
        val multiples = Function.intMultiple(100)
        val result = List.newBuilder[Int].result()
        assert(multiples == result)
    }
}