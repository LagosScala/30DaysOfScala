package example

object PointClass extends App {


    object Point {

        def string2Int(input:String): Int = {
            try {
                input.toInt

            } catch {
                case e:Exception => 0
            }
            
        }

        def apply(sx:String, sy:String): Point = {
            
            new Point(string2Int(sx), string2Int(sy))
        }
    }
    
    case class Point(x:Int, y:Int)


}