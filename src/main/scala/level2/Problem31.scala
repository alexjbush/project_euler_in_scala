package level2

import level2.Coin.{Coin, Coins}

object Coin extends Enumeration {
  protected case class Val(pence: Int) extends super.Val {
    def getRange(upperLimit: Int): LazyList[Coins] = {
      assert(upperLimit >= 0)
      (0 to Math.floor(upperLimit / this.pence.toDouble).toInt).to(LazyList).map(Coins(this, _))
    }
  }

  import scala.language.implicitConversions
  implicit def valueToCoinVal(x: Value): Val = x.asInstanceOf[Val]
  type Coin = Value
  case class Coins(coin: Coin, quantity: Int) {
    assert(quantity >= 0)
    def totalValue: Int = coin.pence * quantity
  }

  val OnePence: Val = Val(1)
  val TwoPence: Val = Val(2)
  val FivePence: Val = Val(5)
  val TenPence: Val = Val(10)
  val TwentyPence: Val = Val(20)
  val FiftyPence: Val = Val(50)
  val OnePound: Val = Val(100)
  val TwoPounds: Val = Val(200)
}

object Problem31 {

  def coinEnumerations(limit: Int): LazyList[Set[Coins]] = {

    def loop(choices: List[Coin], remaining: Int, curr: Set[Coins]): LazyList[Set[Coins]] = choices match {
      case Nil if remaining == 0 => LazyList(curr)
      case h::t if remaining >= 0 =>
        h.getRange(remaining)
        .flatMap { c =>
          loop(t, remaining - c.totalValue, curr + c)
        }
      case _ => LazyList.empty
    }
    loop(Coin.values.toList, limit, Set.empty)

  }

  def main(args: Array[String]): Unit = {
    println(coinEnumerations(200).size)
  }
}
