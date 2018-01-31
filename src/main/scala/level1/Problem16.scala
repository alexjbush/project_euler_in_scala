package level1

object Problem16 {

  val powerSeries: Stream[Long] = Stream.from(1).scanLeft(1L)((z, i) => z * 2)

  def main(args: Array[String]): Unit = {
    println(s"Answer: ${powerSeries.take(50).last.toString}")
  }

}
