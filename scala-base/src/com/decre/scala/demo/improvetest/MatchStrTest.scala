package com.decre.scala.demo.improvetest

import scala.util.Random

/**
  * @author liaofa
  * @date 2019/9/6
  */
object MatchStrTest extends App {
    val arr = Array("Ha", "Hb", "Hc")
    val name = arr(Random.nextInt(arr.length))

    name match {
      case "Ha" => println("Ga")
      case "Hb" => println("Gb")
      case _ => println("你得供虾米")
    }
}
