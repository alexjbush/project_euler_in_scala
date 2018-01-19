package level1

object Problem11 {

  case class Block(cells: List[Int]) {

    val width: Int = math.sqrt(cells.length).toInt
    val rows: List[List[Int]] = cells.grouped(width).toList
    val columns: List[List[Int]] = cells.zipWithIndex.groupBy(_._2 % width).map(_._2.map(_._1)).toList.reverse

    def isIn(x: Int, y: Int): Boolean = x >= 0 && y >= 0 && x < width && y < width

    def get(x: Int, y: Int): Int = cells(y * width + x)

    val diagUp: List[List[Int]] = (-width to width).map { i =>
      (i until width).map { r =>
        val x = r
        val y = r - i
        (x, y)
      }.filter(z => isIn(z._1, z._2)).map(z => get(z._1, z._2)).toList
    }.filter(_.nonEmpty).toList

    val diagDown: List[List[Int]] = (0 until width * 2).map { i =>
      (0 to i).map(r => (i - r, r)).filter(z => isIn(z._1, z._2)).map(z => get(z._1, z._2)).toList
    }.filter(_.nonEmpty).toList

  }

}
