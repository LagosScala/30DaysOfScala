package example

case class Point(x: Int, y: Int)

object Point {
  def apply(sx: String, sy: String): Point =
    new Point(stringToInt(sx).getOrElse(0), stringToInt(sy).getOrElse(0))

  // Convert String to Int
  def stringToInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: Exception => None
    }
  } // Another way would be to return the integer itself or 0 in case of an exception
}
