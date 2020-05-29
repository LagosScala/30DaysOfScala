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

class Person (var name: String, var age: Int, var nationality: String) {
  override def toString(): String = 
          
        "[info.name = " + name +  
               ", info.age = " + age +", info.nationality = " + nationality +"]" 
}

object Person {
    def apply(info: Person): String = {
      s" ${info.name}  ${info.age} ${info.nationality}"  
  }
  
}
