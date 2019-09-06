package com.decre.scala.demo.entity

import com.decre.scala.demo.abstractinterface.{HelloTrait, MakeFriendTrait}

/**
  * @author liaofa
  * @date 2019/9/6
  */
class Worker(var name: String) extends HelloTrait with MakeFriendTrait{
  override def sayHello(name: String): Unit = {
    println("hello," + name)
  }

  override def makeFriends(w: Worker): Unit = {
    println("hello, my name is "+name+", and your name is" + w.name)
  }
}
