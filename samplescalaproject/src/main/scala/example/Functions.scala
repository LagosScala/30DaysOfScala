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


case class PersonOwn (name: String, age: Int, bvn: Long) {

val personOwn = PersonOwn("Ayo", 23, 2233444222L)

}


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

object HOF {
  //the leftFold HOF is use to create a function that sums elements in a list

   def sum(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)
   

   // use a for comprehension to extract the first index of the negative value in the list 
   // then return the Int(index) using the "headOption" if a negative value is present or return None if empty

   def getNegativeIndex(xs: List[Int]): Option[Int] = {

    for ((x, count) <- xs.zipWithIndex if x < 0) yield(count)
   }.headOption



}

      
    
      
     
   
     











