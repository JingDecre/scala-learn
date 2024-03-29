package com.decre.scala.demo.improvetest

/**
  * @author liaofa
  * @date 2019/9/6
  * description: 偏函数
  *
  */
object PartialFuncDemo {
  def func1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def func2(num: String) : Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]) {
    println(func1("one"))
    println(func2("one"))
  }
}
