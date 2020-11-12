package level1

import level1.Problem24.Permutation
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem25 extends AnyFlatSpec with Matchers {

  "indexedFibStream" should "give the example" in {
    Problem25.indexedFibStream.filter(_._2 == 12).head._1.toString should be ("144")
  }


}
