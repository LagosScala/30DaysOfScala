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

case class PersonOwnSpecTest() extends AnyFlatSpec with Matchers {
 
 "the PersonOwn case class parameters" should "be serializable using the"  in {
   
   assert(name.isInstanceOf[Serializable] == true)
   assert(age.isInstanceOf[Serializable] == true)
   assert(bvn.isInstanceOf[Serializable] == true)
 } 
  "Person.unapply method" should "be called on an instance to return an option of tupples by creating an instance of the tuple using 'val' key word" in {

  val tupleOpt = PersonOwn()

  }
             
}




