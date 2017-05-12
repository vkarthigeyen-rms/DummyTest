/**
  * Created by vkarthigeyan on 5/11/17.
  */

import org.scalatest._

class DummyClassTest extends org.scalatest.FlatSpec with Matchers {

  it should "test dummy class" in {
    val dc = new DummyClass
    dc.Check should equal (100f)
  }

}
