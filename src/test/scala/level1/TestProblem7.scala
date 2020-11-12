package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem7 extends AnyFlatSpec with Matchers {

  "primeStream" should "return a list of 6 primes" in {
    Problem7.primeStream.take(6) should be(List(2, 3, 5, 7, 11, 13))
  }


}
