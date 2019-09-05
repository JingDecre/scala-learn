package com.decre.scala.demo.entity

/**
  * @author Decre
  * @date 2019-9-6 0:26
  * @since 1.0.0
  *        Descirption:每个类都有主构造器，主构造器的参数直接放置类名后面，与类交织在一起
  */
class Person(val name: String, val age: Int) {

  //主构造器会执行类定义中的所有语句
  println("Hello Spark")
  val x = 1
  if (x > 1) {
    println("666")
  } else if (x < 1) {
    println("哈哈。。。")
  } else {
    println("呵呵。。。")
  }

  private var address = "BJ"

  def this(name: String, age: Int, address: String) {
    //每个辅助构造器必须以主构造器或其他的辅助构造器的调用开始
    this(name, age)
    println("执行辅助构造器")
    this.address = address
  }
}
