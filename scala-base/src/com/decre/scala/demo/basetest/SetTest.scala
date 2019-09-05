package com.decre.scala.demo.basetest

import scala.collection.immutable.HashSet

/**
  * @author Decre
  * @date 2019-9-6 0:09
  * @since 1.0.0
  *        Descirption:
  */
object SetTest {
  def main(args: Array[String]): Unit = {
    //创建一个空的set
    val set1 = new HashSet[Int]()
    println("set1=" + set1)
    //将元素和set合并生成一个新的set，原有set不变
    val set2 = set1 + 4
    println("set2=" + set2)
    //set中元素不能重复
    val set3 = set1 ++ Set(5,6,7)
    println("set3=" + set3)
    val set4 = Set(4,3,2) ++ set2
    println("set4=" + set4)
  }
}
