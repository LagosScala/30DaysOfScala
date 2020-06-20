package example

object HOF {

  // 2. Sum of elements using foldLeft function
  def sum(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)

  // 3. Get index of first negative element in a List
  def getNegativeIndex(xs: List[Int]): Option[Int] = {
    // convert to vector for easy access
    // filter out the negative elements
    val col = xs.toVector.zipWithIndex.filter { case (v, _) => v < 0 }

    // return None if no negative element exists
    // return the index of first negative element
    // which is the second value of a [Int, Int] tuple
    if (col.isEmpty) None else Some(col(0)._2)
  }
}
