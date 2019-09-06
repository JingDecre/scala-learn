package com.decre.scala.demo.improvetest

import com.decre.scala.demo.entity.Worker

/**
  * @author liaofa
  * @date 2019/9/6
  */
object TraitInterfaceTest {
  def main(args: Array[String]): Unit = {
    val p1 = new Worker("zs")
    val p2 = new Worker("ls")
    p1.sayHello(p2.name)
    p1.makeFriends(p2)
  }
}
