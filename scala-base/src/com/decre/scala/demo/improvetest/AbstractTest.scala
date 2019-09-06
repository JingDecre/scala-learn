package com.decre.scala.demo.improvetest

import com.decre.scala.demo.provider.StudentProvider

/**
  * @author liaofa
  * @date 2019/9/6
  */
object AbstractTest {
  def main(args: Array[String]): Unit = {
    val li = new StudentProvider("ZZB")
    li.sayHello
  }
}
