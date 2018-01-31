package level1

import org.scalatest.{FlatSpec, Matchers}

class TestProblem16 extends FlatSpec with Matchers {

  "powerSeries" should "match the example" in {
    Problem16.powerSeries.take(16).last should be(32768)
  }


}
