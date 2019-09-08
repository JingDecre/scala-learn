package com.decre.scala.demo.entity

/**
  * @author Decre
  * @date 2019-9-7 9:20
  * @since 1.0.0
  *        Descirption:
  */
/* 下面的意思就是表示只要是Comparable就可以传递,下面是类上定义的泛型
  */
class GenericTest1[T <: Comparable[T]] {

  def choose(one:T,two:T): T ={
    //定义一个选择的方法
    if(one.compareTo(two) > 0) one else two
  }

}

class Boy(val name:String,var age:Int) extends Comparable[Boy]{
  override def compareTo(o: Boy): Int = {
    this.age - o.age
  }
}

object GenericTestOne{
  def main(args: Array[String]): Unit = {
    val gt = new GenericTest1[Boy]
    val huangbo = new Boy("huangbo",60)
    val xuzheng = new Boy("xuzheng",66)
    val boy = gt.choose(huangbo,xuzheng)
    println(boy.name)
  }
}