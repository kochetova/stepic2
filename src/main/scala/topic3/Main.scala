package topic3

import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit={
    //3.1.1
    def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
      val FirstNumber = 1 / (sigma * Math.sqrt(2 * scala.math.Pi))
      val SecondNumber = Math.pow(scala.math.E, - Math.pow((x - mu), 2) / (2 * Math.pow(sigma, 2)))

      FirstNumber * SecondNumber
    }
    //3.2.1
    def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
      val x = (potatoWaterRatio - crispsWaterRatio) * weight
      val WeightCrisps = weight - x / (1 - crispsWaterRatio)

      WeightCrisps.setScale(5, BigDecimal.RoundingMode.HALF_UP)
    }
    //3.2.2
    val number = readInt()
    val c = number.toBinaryString.count(d => d.charValue() == '1')

    println(c)

    //3.3.1
    {val s3 = "bar"; val s1 = "foo" + s3; val s2 = "foo" + s3; println(s1 eq s2)}

    {val s1 = "foo"; val s2 = "foo"; println(s1 == s2)}

    {val s3 = "bar"; val s1 = "foo" + s3; val s2 = "foo" + s3; println(s1 == s2)}

    {val s1 = "foo"; val s2 = "foo"; println(s1 eq s2)}

    //3.3.2
    def isCapital(word: String, pos: Int): Boolean = {
      val OctalList = (101 to 132).toList
      OctalList.contains(word(pos).toOctalString.toInt)
    }
    isCapital("Scala", 0)
  }
}
