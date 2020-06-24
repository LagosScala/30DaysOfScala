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

    "The function sums the elements of a list" in {
        val list: List[Int] = List(1, 2, 3, 4, 5)
        assert(Functions.sum(list) == 15)
    }

    "The function returns the index of the first negative number in a list" in {
        val list: List[Int] = List(1, -2, 3, -4, 5)
        assert(Functions.getNegativeIndex(list) == 1)
    }
}