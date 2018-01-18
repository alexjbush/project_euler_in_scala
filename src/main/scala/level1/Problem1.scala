package level1

object Problem1 {

  def isMultipleOf(of: Seq[Int])(is: Int): Boolean = {
    of.exists(is % _ == 0)
  }

  def sumMultiples(multiples: Seq[Int], upto: Int): Int = {
    (0 until upto).foldLeft(0) { (z, i) =>
      if (isMultipleOf(multiples)(i)) i + z
      else z
    }
  }

  def main(args: Array[String]): Unit = {
    println(s"Answer: ${sumMultiples(Seq(3, 5), 1000)}")
  }

}
