package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem13 extends AnyFlatSpec with Matchers {


  "BigInt.+" should "add two numbers together" in {
    (Problem13.BigInt(Seq(9, 9, 9)) + Problem13.BigInt(Seq(9, 9, 9))).toString should be("1998")
  }

  "BigInt.apply" should "create a BigInt from a string" in {
    Problem13.BigInt("1998").n should be(Seq(1, 9, 9, 8))
  }

}
