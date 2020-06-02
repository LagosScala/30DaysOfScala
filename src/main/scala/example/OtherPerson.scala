package example

// Creating enums with case object
sealed trait Gender
case object MALE extends Gender
case object FEMALE extends Gender
case object OTHERS extends Gender

case class OtherPerson(name: String, age: Int, bvn: Long, gender: Gender)
