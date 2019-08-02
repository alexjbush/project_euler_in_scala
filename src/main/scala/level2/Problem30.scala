package level2

object Problem30 {

  def calculateSums(power: Int, digits: Int): Option[List[Int]] = {
    val minDigits = ('1' +: List.fill(digits-1)('0')).mkString.toInt
    val maxSum = Math.pow(9.toDouble, power)*digits
    if(minDigits > maxSum) None
    else Some{
      Stream
        .from(minDigits)
        .takeWhile(_ <= List.fill(digits)(9).mkString.toInt)
        .filter{
          i =>
            i.toString.map(c => Math.pow(c.toString.toInt, power).toInt).sum == i
        }
        .toList
    }
  }

  def findSumPowers(power: Int): List[Int] = {
    Stream.from(2).map(calculateSums(power, _)).takeWhile(_.isDefined).flatten.flatten.toList
  }

  def main(args: Array[String]): Unit = {
    println(s"${findSumPowers(5).sum}")
  }

}
