package example

object Person extends App {
    case class Person (name: String, age: Int, bvn: Long)
    
    val p = Person("sayo", 99, 453423455)

    println(Person.unapply(p).isInstanceOf[Some])

}


