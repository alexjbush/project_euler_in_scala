package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem3 extends AnyFlatSpec with Matchers {

  "isPrime" should "detect prime numbers" in {
    Problem3.isPrime(9) should be(false)
    Problem3.isPrime(23) should be(true)
    Problem3.isPrime(2) should be(true)
  }

  "largestPrimeFactor" should "find the largest number" in {
    Problem3.largestPrimeFactor(13195) should be (29)
  }
}
