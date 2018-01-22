package level1

object Problem15 {

  def findNumRoutesSlow(dim: Int): Int = {

    def loop(stack: List[(Int, Int)], acc: Int): Int = stack match {
      case Nil => acc
      case (`dim`, `dim`) :: t => loop(t, acc + 1)
      case (x, `dim`) :: t => loop((x + 1, dim) :: t, acc)
      case (`dim`, y) :: t => loop((dim, y + 1) :: t, acc)
      case (x, y) :: t => loop((x + 1, y) :: (x, y + 1) :: t, acc)
    }

    loop(List((0, 0)), 0)

  }

  def findNumRoutes(dim: Int): Int = {

    def loop(stack: Vector[(Int, Int)], score: Map[(Int, Int), Int]): Int = {
      stack match {
        case (0, 0) +: t => score((0, 1)) + score((1, 0))
        case (x, y) +: t if x < 0 || y < 0 => loop(t, score)
        case (`dim`, y) +: t =>
          val newStack = t :+ (dim - 1, y) :+ (dim, y - 1)
          val newScore = score.+((dim -> y, score(dim, y + 1)))
          loop(newStack, newScore)

        case (x, `dim`) +: t =>
          val newStack = t :+ (x, dim - 1) :+ (x - 1, dim)
          val newScore = score.+((x -> dim, score(x + 1, dim)))
          loop(newStack, newScore)

        case (x, y) +: t =>
          val newStack = t :+ (x, y - 1) :+ (x - 1, y)
          val newScore = score.+((x -> y, score(x + 1, y) + score(x, y + 1)))
          loop(newStack, newScore)

      }
    }

    loop(Vector((dim, dim - 1), (dim - 1, dim)), Map(((dim, dim), 1)))

  }


  def main(args: Array[String]): Unit = {
    println(s"Answer: ${findNumRoutes(15)}")
  }

}
