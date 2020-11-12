package level1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestProblem19 extends AnyFlatSpec with Matchers {

  "Date" should "be correct" in {
    Problem19.Date(1, 3, 1904, 3).isLeapYear should be (true)
    Problem19.Date(31, 3, 1904, 3).isLastDayOfMonth should be (true)
    Problem19.Date(31, 12, 1904, 3).nextDay should be (Problem19.Date(1, 1, 1905, 4))
    Problem19.Date(31, 12, 1904, 6).nextDay should be (Problem19.Date(1, 1, 1905, 0))
  }

}
