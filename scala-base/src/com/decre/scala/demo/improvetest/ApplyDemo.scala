package com.decre.scala.demo.improvetest

/**
  * @author liaofa
  * @date 2019/9/6
  */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
    //调用Array伴生对象的apply方法
    val array = Array(1,2,3,4,5)
    println(array.toBuffer)
    //new了一个长度为9的数组，数组里面包含了9个null
    var arr = new Array(9)
    println(arr)
  }
}
