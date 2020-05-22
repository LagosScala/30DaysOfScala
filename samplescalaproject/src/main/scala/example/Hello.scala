package example

object Hello extends Greeting with App {
  println("Welcome to 30 days of Scala")
}

trait Greeting {
  lazy val greeting: String = "hello"
}
