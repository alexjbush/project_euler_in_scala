package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem14 extends AnyFlatSpec with Matchers {


  "collatzLengthUnderN" should "create a correct sequence" in {
    Problem14.collatzLengthUnderN(3) should be(Map(1 -> 1, 2 -> 2))
    Problem14.collatzLengthUnderN(13)(13) should be(10)
  }


}
