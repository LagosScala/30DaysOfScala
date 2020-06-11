package example

import org.scalatest.flatspec.AnyFlatSpec

class PointSpec extends AnyFlatSpec {
  "The Point class" should "create a point using integer parameters" in {
    val point = Point(10, 20)
    assert(point.isInstanceOf[Point])
  }

  it should "create a point using number strings" in {
    assert(Point("10", "20") == Point(10, 20))
  }

  it should "create a point with an axis of Zero(0) using invalid number string" in {
    assert(Point("Mike", "2") == Point(0, 2))
  }
}
