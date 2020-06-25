package example

import org.scalatest.WordSpec

class Assignment6Specs extends WordSpec {

  "The  function should return sum of the list." in {
    val result = Assignment6.sum(List(1, 2, 3, 4, 5))
    assert(result == 15)
  }
  "The  function should return index of a negative value in list." in {
    val index = Assignment6.getNegativeIndex(List(1, 2, -3, 4, 5))
    assert(index == 2)
  }
}

