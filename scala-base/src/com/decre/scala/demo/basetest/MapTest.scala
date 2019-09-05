package com.decre.scala.demo.basetest

/**
  * @author Decre
  * @date 2019-9-5 21:34
  * @since 1.0.0
  *        Descirption:
  */
object MapTest {
  def main(args: Array[String]): Unit = {
    val scores = Map("zs" -> 66, "ls" -> 77, "ww" -> 88)
    println(scores.toBuffer)
    val scores2 = Map(("zs", 67), ("ls", 78), ("ww", 89))
    println(scores2.toBuffer)

    println(scores("zs"))
    println(scores2.get("ls"))
    println(scores.getOrElse("zl", 0))
  }
}
