package com.decre.scala.demo.basetest

/**
  * @author liaofa
  * @date 2019/9/3
  */
object MethodAndFunc {

  def m1(f:(Int,Int) => Int, x: Int, y: Int): Int = {
    f(x, y)
  }

  var f1 = (x: Int, y: Int) => x + y

  var f2 = (m: Int, n: Int) => m * n

  def main(args: Array[String]): Unit = {
    val r1 =m1(f1, 5, 6)
    println(r1)

    val r2 = m1(f2, 5, 6)
    println(r2)
  }
}
