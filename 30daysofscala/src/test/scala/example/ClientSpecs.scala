package example

import org.scalatest._

class ClientSpecs extends WordSpec {

  "Test if the case class is serializable then return true" in {
    val myClient = Client("peter", 32, 45)
    assert(myClient.isInstanceOf[Serializable] == true)
  }
  "Test to see if an instanc of the client class returns a tuple" in {
    val isTuple = Client("peteii", 12, 45)
    assert(
      Client.unapply(isTuple) == Some((isTuple.name, isTuple.age, isTuple.bvn))
    )
  }
}
