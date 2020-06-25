package example

object Assignment6 {
  def sum(xs: List[Int]): Int = {
    xs.foldLeft(0)(_ + _)
  }

def getNegativeIndex(xs: List[Int]): Int = {
    def isNegative(x: (Int, Int)): Int = if(x._1 < 0) x._2 else 0 
    xs.zipWithIndex.map(isNegative).max 
  }
}
