package example

import org.scalatest.WordSpec

class FunctionsSpec extends WordSpec {
    "The function detects if a number is odd" in {
        val isOdd = Functions.oddNumber(9)
        assert(isOdd == true)
    }

    "The funtion returns a list of multiples of a number x " in {
        val multiples = Functions.intMultiples(1)
        assert(multiples == List(1, 2, 3, 4, 5))
    }
}