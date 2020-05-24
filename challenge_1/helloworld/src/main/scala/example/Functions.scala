package example

object Functions {
    def oddNumber(x: Int): Boolean = {
        if (x%2 == 0)
            false
        else
            true
    }

    def intMultiples(x: Int): List[Int] = {
        var result = List(x)
        for (c <- 2 until 6) {
            result = c*x :: result
        }
        result.reverse
    }

}