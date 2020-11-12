package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem6 extends AnyFlatSpec with Matchers {

  "sumOfSquares" should "equal example" in {
    Problem6.sumOfSquares(1 to 10) should be(385)
  }

  "squareOfSums" should "equal example" in {
    Problem6.squareOfSums(1 to 10) should be(3025)
  }

  "diffSqrSumSumSqr" should "equal example" in {
    Problem6.diffSqrSumSumSqr(1 to 10) should be (2640)
  }

}
