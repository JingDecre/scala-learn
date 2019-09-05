package com.decre.scala.demo.test

import scala.collection.mutable.ListBuffer

/**
  * @author Decre
  * @date 2019-9-6 0:10
  * @since 1.0.0
  *        Descirption:
  */
object MutableTest {
  def main(args: Array[String]): Unit = {
    //构建一个可变序列
    val list1 = ListBuffer[Int](1,2,3)
    //创建一个空的可变序列
    val list2 = new ListBuffer[Int]
    //向list2中追加元素，注意：没有生成新的集合
    list2 += 6
    list2.append(7)
    println("list2=" + list2)

    //将list2中的元素追加到list1中，注意：没有生成新的集合
    list1 ++= list2
    print("list1=" + list1)

    //将list1和list2合并成一个新的list集合，注意：生成新的集合
    val list3 = list1 ++ list2
    println("list3=" + list3)

    //将元素追加到list1后面生成一个新的集合
    val list4 = list1 :+ 9
    print("list4=" + list4)

  }

}
