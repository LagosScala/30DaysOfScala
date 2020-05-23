package example

object Functions{

  def max(x: Int, y:Int): Int ={
    val name: String = "30 days of Scala"

    if(x > y)
      x
    else
      y
  }

  def powerOfTwo(x: Int): Double = math.pow(x,2)
  def isOddNumber(x:Int): Boolean = {
    if (x % 2 != 0)
      true
    else
      false
  }

  //Val a and b are the lower and upper bounds of the for loop
  def intMultiples(x:Int, a:Int, b:Int): List[Int] = {
    //List(x * 1, x * 2, x * 3, x * 4, x * 5, x * 6, x * 7, x * 8, x * 9, x * 10... etc)
    var k: Int = 1
    var y = List(0)
    for (i <- (a to b).reverse) {
      k = x * i
      y = k :: y
    }

    var result = y.slice(0, y.size -1)

    result: List[Int]

  }
}