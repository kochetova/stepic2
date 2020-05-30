package topic2

import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    //2.1.1
    {
      val name = readLine()

    println("Hi, " + name + "!")
    }
    //2.3.1
    {
      val FirstNumber = readInt()
      val SecondNumber = readInt()

      println(FirstNumber - SecondNumber)
    }
    //2.3.2
    {
      val FirstNumber = readInt()
      val SecondNumber = readInt()
      val ThirdNumber = readInt()

      println(FirstNumber * SecondNumber * ThirdNumber)
    }
  }
}
