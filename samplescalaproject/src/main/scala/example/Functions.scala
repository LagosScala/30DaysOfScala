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
        if(x % 2 != 0)
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
      s"Hi. I am ${info.name}from ${info.nationality}, and I am ${info.age} years old! "  
  }
  
}




case class PersonOwn (name: String = "John", age: Int = 21, bvn: Long = 6330322178L) 

sealed trait Base

  case object name extends Base 
  case object age extends Base
  case object bvn extends Base





