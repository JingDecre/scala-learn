package com.decre.scala.demo.improvetest

import scala.util.Random

/**
  * @author liaofa
  * @date 2019/9/6
  */
object MatchDataTypeTest extends App {
  //val v = if(x >= 5) 1 else if(x < 2) 2.0 else "hello"
  val arr = Array("hello", 1, 2.0, MatchDataTypeTest)
  val v = arr(Random.nextInt(4))
  println(v)
  v match {
    case x: Int => println("Int " + x)
    case y: Double if(y >= 0) => println("Double "+ y)
    case z: String => println("String " + z)
    case _ => throw new Exception("not match exception")
  }
}
