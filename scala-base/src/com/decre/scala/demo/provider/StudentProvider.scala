package com.decre.scala.demo.provider

import com.decre.scala.demo.abstractinterface.AbstractGreet

/**
  * @author liaofa
  * @date 2019/9/6
  */
class StudentProvider(name: String) extends AbstractGreet {
  override def sayHello: Unit = {
    println("Hello," + name)
  }
}
