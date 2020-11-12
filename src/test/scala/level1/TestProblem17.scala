package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem17 extends AnyFlatSpec with Matchers {


  "numberToWords" should "get the example" in {
    Problem17.numberToWords(List(3,4,2)) should be("threehundredandfourtytwo")
  }

}
