package example

class Person (val name: String, var age: Int, val nationality: String) {
  assert(age >= 0, "Negative age not allowed")
  override def toString: String = s"Hi. I am [$name] from [$nationality], and I am [$age] years old!"
}

object Person {
  // Perfect factory
  def apply(name: String, age: Int, nationality: String): Person = new Person(name, age, nationality)
}
