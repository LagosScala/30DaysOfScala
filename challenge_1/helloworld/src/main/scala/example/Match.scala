package example
object Match extends App {
    sealed trait Lang
    case object Scala extends Lang
    case object Java extends Lang
    case object Python extends Lang

    def checkLang(x: Lang): String = {
        x match {
            case Scala  => Scala.toString
            case Java   => Java.toString
            case Python => Python.toString
        }
    }
    val a = checkLang(Python)
    println(a)
}