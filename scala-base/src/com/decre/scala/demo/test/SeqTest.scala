package com.decre.scala.demo.test

/**
  * @author Decre
  * @date 2019-9-5 22:00
  * @since 1.0.0
  *        Descirption:
  */
object SeqTest {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
    // 以下作用等同
    val list2 = 0 :: list1
    val list3 = list1.:: (0)
    val list4 = 0 +: list1
    val list5 = list1. +: (0)
    println("list2=" + list2)
    println("list3=" + list3)
    println("list4=" + list4)
    println("list5=" + list5)
    //将3插入到集合list1的后面生成一个新的list
    val list6 = list1 :+ 3
    println("list6="+list6)

    //将2个list集合合并成一个新的list集合
    val list0 = List(7,8,9)
    println("list0="+list0)
    val list7 = list1 ++ list0
    println("list7="+list7)

    //将list0插入到list1前面生成一个新的集合
    val list8 = list0 ++: list1
    println("list8="+list8)

    //将list1插入到list0前面生成一个新的集合
    val list9 = list1 ++: list0
    println("list9="+list9)

  }
}
