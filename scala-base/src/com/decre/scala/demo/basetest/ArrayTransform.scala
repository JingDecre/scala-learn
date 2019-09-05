package com.decre.scala.demo.basetest

/**
  * @author Decre
  * @date 2019-9-5 21:25
  * @since 1.0.0
  *        Descirption:
  */
object ArrayTransform {

  def main(args: Array[String]): Unit = {
    //初始化一个数组
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8)
    val res = for (e <- arr if e % 2 == 0) yield  e * 10
    println(res.toBuffer)
    // 跟上面等同，高级用法
    val r = arr.filter(_ % 2 == 0).map(_ * 10)
    println(r.toBuffer)

  }

}
