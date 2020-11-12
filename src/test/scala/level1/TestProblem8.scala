package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem8 extends AnyFlatSpec with Matchers {

  "largestProduct" should "run the test case" in {
    Problem8.largestProduct(Problem8.problemList, 4) should be(5832)
  }


}
