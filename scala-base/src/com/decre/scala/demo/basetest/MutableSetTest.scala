package com.decre.scala.demo.basetest

import scala.collection.mutable

/**
  * @author Decre
  * @date 2019-9-6 0:15
  * @since 1.0.0
  *        Descirption:
  */
object MutableSetTest {
  def main(args: Array[String]): Unit = {
    //创建一个可变的set
    val set1 = new mutable.HashSet[Int]()
    println("list1=" + set1)
    //向set1中添加元素
    set1 += 4
    //add等价于+=
    set1.add(5)
    set1 ++= Set(6,7,8)
    println("set1="+set1)
    //删除一个元素
    set1 -= 8
    set1.remove(7)
    println("set1=" + set1)

  }
}
