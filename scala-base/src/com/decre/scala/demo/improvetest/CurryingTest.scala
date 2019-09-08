package com.decre.scala.demo.improvetest

/**
  * @author Decre
  * @date 2019-9-7 8:31
  * @since 1.0.0
  *        Descirption:
  */
object CurryingTest {
  def mysum(x: Int)(y: Int): Int = x + y

  def main(args: Array[String]): Unit = {
    val f = mysum _
    val f2 =f(1)
    val f3 =f2(2)
    println(f3)
  }
}
