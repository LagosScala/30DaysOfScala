package example

object Person {

 def apply(  name: String,  age: Long,  nationality: String): Person = {
   new Person(name, age,nationality)
 }

}

class Person(  name: String,  age: Long,   nationality: String){

  def print = println(s"My name is $name, am $age years of age,am from $nationality")

}


