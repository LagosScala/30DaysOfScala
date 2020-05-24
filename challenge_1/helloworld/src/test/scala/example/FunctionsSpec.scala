package example

import org.scalatest.WordSpec

class FunctionsSpec extends WordSpec {
    "The function detects if a number is odd" in {
        val isOdd = Functions.oddNumber(9)
        assert(isOdd == true)
    }

    "The funtion returns a list of multiples of a number x " in {
        val multiples = Functions.intMultiples(10)
        assert(multiples == List(10, 20, 30, 40, 50))
    }
}