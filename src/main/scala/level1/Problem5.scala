package level1

object Problem5 {

  def isEvenlyDivisibleBy(div: Seq[Int])(n: Int): Boolean = {
    !div.exists(n % _ != 0)
  }

  def main(args: Array[String]): Unit = {
    println(s"Answer: ${(2520 until Int.MaxValue by 10).filter(isEvenlyDivisibleBy(1 to 20)).head}")
  }

}
