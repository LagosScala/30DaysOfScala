package example

case class Client(name: String, age: Int, bvn: Int) {

  def print(): String = {
    s"Client name $name, client age is $age ,client bvn is $bvn"
  }

  }
