package com.dt.scala.hello

/**
 * 元组
 *
 * Created by dancer on 2016/6/21.
 */
object TupleOps {
  def main(args: Array[String]) {
    //类型推导
    val triple = (100,"Scala","Spark")
    println(triple._1)
    println(triple._2)
    println(triple._3)
  }
}
