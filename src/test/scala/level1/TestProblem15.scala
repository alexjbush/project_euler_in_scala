package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem15 extends AnyFlatSpec with Matchers {

  "findNumRoutes" should "match the example" in {
    Problem15.findNumRoutes(2) should be(6)
  }


}
