package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem21 extends AnyFlatSpec with Matchers {

  "properDivisors" should "give the example" in {
    Problem21.properDivisors(220).sum should be(284)
    Problem21.properDivisors(284).sum should be(220)
  }

}
