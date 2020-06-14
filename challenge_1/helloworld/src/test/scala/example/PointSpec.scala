package example

import org.scalatest.FunSpec

class PointSpec extends FunSpec {
    it("returns a point object from the case class Point") {
        val p1 = PointClass.Point("3", "4")
        assert(p1 == PointClass.Point(3, 4))
    }

    it("returns a Point object with passed in illegal string(s) set to zero") {
        val p2 = PointClass.Point("3", "four")
        assert(p2 == PointClass.Point(3, 0))
    }
}