package level1

object Problem7 {

  def primeStream: Stream[Int] = {

    def next(prev: List[Int]): Stream[Int] = {
      val n = Stream.from(prev.last + 2).filter { i =>
        !prev.exists(i % _ == 0)
      }.head
      Stream.cons(n, next(prev.:+(n)))
    }

    Stream.cons(2, Stream.cons(3, next(List(2, 3))))

  }

  def main(args: Array[String]): Unit = {
    println(s"Answer: ${primeStream.take(10001).last}")
  }

}
