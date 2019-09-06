package com.decre.scala.demo.basetest

/**
  * @author liaofa
  * @date 2019/9/3
  */
object MathOperation {
  def main(args: Array[String]): Unit = {
    var x = 1

    val y = if (x > 0) 1 else -1

    val z = if (x > 1) 1 else  "error"

    println("z=" + z)

    val m = if (x > 2) 1
    println("m=" + m)

    val n = if (x > 2) 1 else ()
    println("n=" + n)

    val k = if (x < 0) 0 else if (x >= 1) 1 else -1
    println("k=" + k)
  }
}
