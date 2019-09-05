package com.decre.scala.demo.test

/**
  * @author Decre
  * @date 2019-9-5 21:41
  * @since 1.0.0
  *        Descirption:
  */
object TuppleTest {
  def main(args: Array[String]): Unit = {
    val t1 = ("hadoop", 3.14, 999)
    println(t1)

    val t2,(a,b,c) = ("spark", 3.01, 556)
    println(t2)
    println(t2._1)

    var arr = Array(("zs", 77), ("ls", 88))
    arr ++= Array(("ll", 85))
    val map1 = arr.toMap
    println(map1.toBuffer)

    val scores =Array(77,66,88)
    val names = Array("zs", "ls", "ww")

    var ns1 = names.zip(scores)
    println(ns1.toBuffer)

  }
}
