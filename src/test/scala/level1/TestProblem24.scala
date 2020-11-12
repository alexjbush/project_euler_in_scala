package level1

import level1.Problem24.Permutation
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem24 extends AnyFlatSpec with Matchers {

  "permutationStream" should "give the example" in {
    Problem24.permutationStream(Seq(0, 1, 2)).toList should be(
      List(
        Permutation(List(0, 1, 2)),
        Permutation(List(0, 2, 1)),
        Permutation(List(1, 0, 2)),
        Permutation(List(1, 2, 0)),
        Permutation(List(2, 0, 1)),
        Permutation(List(2, 1, 0)))
    )
  }


}
