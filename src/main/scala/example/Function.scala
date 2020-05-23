package example

object Function {

  def max(x: Int, y: Int): Int = if (x > y) x else y

  def powerOfTwo(x: Int): Double = math.pow(x, 2)

  /**
   * Check if number is ODD
   * @param x - Number
   * @return true or false
   */
  def isOddNumber(x : Int): Boolean = x % 2 != 0

  /**
   * Return the list of multiples of a given number
   * @param x - Number
   * @return - List of integers
   */
  def intMultiples(x: Int): List[Int] = List.from(for (n <- 1 to x if (x % n == 0)) yield n)
}
