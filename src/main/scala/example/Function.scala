package example

object Function {

    def isOddNumber(x: Int): Boolean = {
        if(x % 2 == 0)
            false
        else
            true
    }

    def intMultiple(x: Int): List[Int] = {
        val result = List.newBuilder[Int]
        if(x == 0) {
            result.result()
        } else {
        var check: Int = 0
        var counter: Int = 0
        while(check < 50) {
            check = x * (2 + counter)
            if (check < 50) {
                result += check
                counter = counter + 1
            }
        } 

        result.result()
        }
    }
}