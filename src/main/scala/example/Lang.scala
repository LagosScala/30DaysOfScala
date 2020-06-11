package example

sealed trait Lang

case object Scala extends Lang

case object Java extends Lang

case object Python extends Lang


object Lang {
  def matchLang(lang: Any): String = lang match {
    case l: Lang => l.toString
    case _ => "A language from Mars :)"
  }
}
