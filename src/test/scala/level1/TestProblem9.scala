package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem9 extends AnyFlatSpec with Matchers {

  "pythagoreanTriplet" should "run a triplet" in {
    Problem9.pythagoreanTriplet.take(1) should be(Seq((3, 4, 5)))
  }


}
