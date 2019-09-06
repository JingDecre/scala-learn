package com.decre.scala.demo.basetest

/**
  * @author liaofa
  * @date 2019/9/3
  */
class Outer {

  class Inner{
    def start() = println("start")
    def end() = println("end")
    private def  pause() = println("pause")
  }

}
