package com.decre.scala.demo.improvetest

import com.decre.scala.demo.entity.Session

import scala.collection.mutable.ArrayBuffer

/**
  * @author liaofa
  * @date 2019/9/6
  */
object SessionFactory {
  var counts = 5
  val sessions = new ArrayBuffer[Session]()
  while (counts > 0) {
    sessions += new Session
    counts -= 1
  }

  def getSession(): Session = {
    // 移除并返回下标为0的对象
    sessions.remove(0)
  }
}
