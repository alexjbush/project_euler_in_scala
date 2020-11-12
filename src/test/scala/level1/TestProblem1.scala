package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem1 extends AnyFlatSpec with Matchers {

  "sumMultiples" should "pass the test in the description" in {
    Problem1.sumMultiples(List(3, 5), 10) should be(23)
  }
}
