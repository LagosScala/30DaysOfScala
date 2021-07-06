package example

import org.scalatest.FunSpec

class ClassesSpec extends FunSpec {
    it("returns properties of instantiated class") {
        val p = Classes.Person("Sayo", 99, "Nigerian")
        assert(p.name === "Sayo")
        assert(p.age === 99)
        assert(p.nationality === "Nigerian")
    }
}