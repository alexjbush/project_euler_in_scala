package level1

object Problem7 {

  def primeStream: Stream[Int] = {

    def next(prev: List[Int]): Stream[Int] = {
      val n = Stream.from(prev.head + 1).filter { i =>
        !prev.exists(i % _ == 0)
      }.head
      Stream.cons(n, next(n :: prev))
    }

    Stream.cons(2, next(List(2)))

  }

  def main(args: Array[String]): Unit = {
    println(s"Answer: ${primeStream.take(10001).last}")
  }

}
