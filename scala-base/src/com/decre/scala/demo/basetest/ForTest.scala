package com.decre.scala.demo.basetest

/**
  * @author Decre
  * @date 2019-9-5 21:20
  * @since 1.0.0
  *        Descirption:
  */
object ForTest {
  def main(args: Array[String]): Unit = {
    //初始化一个数组
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8)
    //增强for循环
    for (i <- arr)
      print(i + "\t")

    println()
    //好用的until会生成一个Range
    //reverse是将前面生成的Range反转
    for (i <- (0 until arr.length).reverse)
      print(arr(i))
  }
}
