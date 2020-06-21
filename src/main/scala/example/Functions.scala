package example

/**
 * @author Brume
 **/
object Functions {
  def oddNumber(x: Int): Boolean = {
    if (x % 2 == 1)
      true
    else false
  }
  def intMultiples(x:Int): List[Int] = List(1,2,3,4,5).map(_*x)

}
