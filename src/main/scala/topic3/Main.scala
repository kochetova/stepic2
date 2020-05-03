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

    def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
      val x = (potatoWaterRatio - crispsWaterRatio) * weight
      val WeightCrisps = weight - x / (1 - crispsWaterRatio)

      WeightCrisps.setScale(5, BigDecimal.RoundingMode.HALF_UP)
    }
  }
}
