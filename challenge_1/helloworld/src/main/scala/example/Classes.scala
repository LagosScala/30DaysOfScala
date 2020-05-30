package example
object Classes extends App {
    // companion object
    object Person {
        def apply(name:String, age:Int, nationality:String): Person = {
            new Person(name, age, nationality)
        }
    }

    // class
    class Person(val name:String, val age:Int, val nationality:String) {
        override def toString = s"Name: $name, Age: $age Nationality: $nationality "
    }

    // instantiating the class and printing contents
    var p = Person("Sayo", 99, "Nigerian")
    println(p)
    println(p.name)
    println(p.age)
    println(p.nationality)

}