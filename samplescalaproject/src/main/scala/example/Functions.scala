package example

object Functions {

    def max(x: Int, y: Int): Int = {
        if(x > y)
          x
        else
          y
    }

    def powerOfTwo(x: Int): Double = math.pow(x, 2)

    def isOddNumber(x: Int): Boolean = {
        if(x % 2 == 1)
          true
        else
          false  
    }

    def intMultiples(x: Int): List[Int]= {
        List.range(1, 10).map(_*x)

    }
}