package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem5 extends AnyFlatSpec with Matchers {

  "isEvenlyDivisibleBy" should "be divisible" in {
    Problem5.isEvenlyDivisibleBy(1 to 10)(2520) should be(true)
    Problem5.isEvenlyDivisibleBy(1 to 10)(2521) should be(false)
  }


}
