package level3

import level1.Problem18
import level1.Problem18.Tree
import scala.io.Source

object Problem67 {

  def loadTriangle: Tree = {
    val lines = Source.fromResource("Problem67/triangle.txt").getLines.foldLeft("")(_ + "\n" + _)
    Problem18.stringToLists(lines)
  }

  def main(args: Array[String]): Unit = {
    println(s"Answer: ${Problem18.reduceTree(loadTriangle)}")
  }

}
