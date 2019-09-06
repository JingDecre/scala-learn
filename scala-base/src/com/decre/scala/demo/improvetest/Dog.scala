package com.decre.scala.demo.improvetest

/**
  * @author liaofa
  * @date 2019/9/6
  */
object Dog {
  // 伴生类之间可以相互访问彼此间的私有变量、方法
  private var CONSTANT = "汪汪汪。。。"

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    dog.name = "ZZB"
    dog.printName()
  }

}

class Dog {
  val id = 666
  private var name: String = "LXC"

  def printName(): Unit = {
    // 伴生类之间可以相互访问彼此间的私有变量、方法
    println(Dog.CONSTANT + name)
  }

}
