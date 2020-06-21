package example

import org.scalatest.FunSuite

/**
 * @author Brume
 **/
class FunctionTest extends FunSuite {
  test("oddNumber") {
    val odd = Functions.oddNumber(3)
    assert(odd)

  }

  test("ListMultiples") {
    val multiple = Functions.intMultiples(2)
    print(multiple)
    assert(multiple === List(2, 4, 6, 8, 10) )
  }


}
