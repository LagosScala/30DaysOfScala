package example

import org.scalatest.FunSpec

class MatchSpec extends FunSpec {
    it ("matches Langs of Python, Scala or Java") {
        val java = Match.Java
        val python = Match.Python
        val scala = Match.Scala

        assert(Match.checkLang(java) == "Java")
        assert(Match.checkLang(python) == "Python")
        assert(Match.checkLang(scala) == "Scala")
    }
}