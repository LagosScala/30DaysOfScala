package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "Welcome to 30 days of Scala"
  }
}


class PersonSpec extends AnyFlatSpec with Matchers {
  val (name, age, nationality) = ("Michael", 12, "Nigerian")
 
  val expectedString = "[info.name = " + name +  
             ", info.age = " + age +", info.nationality = " + nationality +"]" 
  
  "The Person class" should "create a new instance of the person's object without requiring the 'new' key word using the apply method" in {
    if (age < 0) "AssertionError"
    else
     assert(new Person(name, age, nationality).toString == expectedString)
    }

}

case object PersonOwnSpecTest extends AnyFlatSpec with Matchers {
 
 "the PersonOwn case class parameters" should "be serializable using the"  in {
   
  val anotherPerson = PersonOwn("TY", 32, 34222233L) 
  assert(anotherPerson.isInstanceOf[Serializable] == true)
  

 } 
         
}


case object Lang extends AnyFlatSpec with Matchers {
  val result = s"Lang language is good"  // create a string and assign it to an instance of result

  
"the case object Lang" should "pattern match and return a string" in {

 assert(Lang.toString == result)

}

}

class HOFSpec extends AnyFlatSpec with Matchers {

  val list: List[Int]  = List(-2,-1,2,3,4)

  "the foldLeft HOF" should "sum the elements in the List" in {
        
        assert(HOF.sum(list) == 6)
  }

    "the getNegativeIndex created using the zipWithIndex transformer" should "return the index of the first negative value in the list" in{

      assert(HOF.getNegativeIndex(list) == Some(0))
    }    
       
  
}