package com.dt.scala.hello

import scala.io.Source

/**
 * 懒加载
 * Created by dancer on 7/25/2016.
 */
object LazyOps {
  def main(args: Array[String]):Unit= {

    //val file = Source.fromFile("D:\\Vedio\\Scala\\Scala\\Learning Scala in small bites.pdf")
    // 变量第一次被使用时才被实例化。
    lazy  val _file = Source.fromFile("D:\\Vedio\\Scala\\Scala\\Learning Scala in small bites.pdf")

    println("Lazy..")
    for (line <- _file.getLines())println(line)

  }
}
