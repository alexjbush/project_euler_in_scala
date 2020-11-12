package level2

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TestProblem28 extends AnyFunSpec with Matchers{

  it("first 5 numbers"){
    Problem28.diagonalGrid(5).toList should be (List(1, 3, 5, 7, 9, 13, 17, 21, 25))
  }

}
