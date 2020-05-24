package example

object Functions {
    def oddNumber(x: Int): Boolean = {
        if (x%2 == 0)
            false
        else
            true
    }

    def intMultiples(x: Int): List[Int] = {
        var value: Int = 0
        var result = List(x)
        var multiplier: Int = 2
        while (value < 50) {
            value = multiplier * x
            multiplier+=1
            result = value :: result
        }

        result.reverse
    }

}