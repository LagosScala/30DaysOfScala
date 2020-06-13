package example

import scala.util.Try

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



case class Point(x: Int, y: Int)

object Point {

  val zero = Point(0,0)

  // Returns None if the String could not be parsed into an integer
  def string2Int(x: String): Option[Int] = Try(x.toInt).toOption

  
  
  def apply(sx: String, sy: String): Point = (
    
    //using a for-comprehension over options to only yield a value if both co-ordinates are valid
    
      for {sx <- string2Int(sx)
           sy <- string2Int(sy)
          } yield Point(sx, sy)).getOrElse(zero)
} 


  sealed trait Lang
  case object Scala extends Lang
  case object Java extends Lang 
  case object Python extends Lang


object CaseClassTest extends App  {
  def lang2String(p: Lang): String = p match {
  
  // pattern match case objects Scala, Java, and Python together
  case Scala | Java | Python => s"Lang language is good"  
  case _       => "Not within the language Lang"    // throw Exception if not within the Lang language        
 }
}











