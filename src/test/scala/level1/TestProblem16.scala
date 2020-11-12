package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem16 extends AnyFlatSpec with Matchers {

  "BigInt.*" should "multiply a number by 3" in {
    (Problem16.BigInt(Seq(9, 9, 9)) * 3).toString should be("2997")
  }

  "powerSum" should "return the example" in {
    Problem16.powerSum(15) should be(26)
  }

}
