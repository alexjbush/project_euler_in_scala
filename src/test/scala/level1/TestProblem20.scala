package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem20 extends AnyFlatSpec with Matchers {

  "factorial" should "give the example" in {
    Problem20.factorial(10).toString should be("3628800")
  }

}
