package com.decre.scala.demo.entity

/**
  * @author liaofa
  * @date 2019/9/6
  */
class Student extends People {
  private var score = 59

  def getScore = score

  override def getName: String = super.getName + ":嬴政"
}
