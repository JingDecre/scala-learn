package com.decre.scala.demo.basetest


/**
  * @author liaofa
  * @date 2019/9/3
  */
object CycleTest {
  def main(args: Array[String]): Unit = {
    var n = 10
    while ( {
      n > 0
    }) {
      println(n)
      n -= 1
    }

    for (i <- 1 to 10)
      println(i)

    val arr = Array("a", "b", "c")

    for (i <- arr)
      println(i)

    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 + i * j) + " ")
    println()
    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val v = for (i <- 1 to 10) yield i * 10
    println(v)
  }
}
