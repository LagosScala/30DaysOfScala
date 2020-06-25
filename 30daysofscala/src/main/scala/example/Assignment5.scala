package example
object Point {

  def stringToInt(x: String): Option[Int] = {
    try {
      Some(x.toInt)
    } catch {
      case e: Exception => None
    }
  }

  def apply(sx: String, sy: String): Point = {
    val x = stringToInt(sx)
    val y = stringToInt(sy)
    (x, y) match {

      case (Some(x), Some(y)) => Point(x, y)
      case (_, _)             => Point(0, 0)
    }
  }

}
case class Point(x: Int, y: Int)

sealed trait Lang
case object Scala extends Lang
case object Java extends Lang
case object Python extends Lang

object SearchIfObjectExtendLang extends App {
  def convertToString(lan: Lang): String = lan match {

    case Scala | Java | Python => s"Lang language is good"
    case _                     => s"Not within the language Lang"
  }
}
