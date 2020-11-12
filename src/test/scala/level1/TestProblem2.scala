package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem2 extends AnyFlatSpec with Matchers {

  "fibStream" should "return a sequence of fib numbers" in {
    Problem2.fibStream.take(4) should be(Seq(1, 2, 3, 5))
  }
}
