package com.decre.scala.demo.improvetest

/**
  * @author liaofa
  * @date 2019/9/6
  */
object SingletonDemo {
  def main(args: Array[String]): Unit = {
    val session = SessionFactory.getSession()
    println(session)
  }
}
