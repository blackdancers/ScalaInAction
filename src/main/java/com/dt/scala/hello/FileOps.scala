package com.dt.scala.hello

import scala.io.Source

/**
 * 文件操作
 * Created by dancer on 2016/6/21.
 */
object FileOps {
  def main(args: Array[String]) {
    //val file_ = Source.fromFile("D:\\Vedio\\Scala\\ScalaInAction\\src\\com\\dt\\scala\\hello\\FileOps.scala")
    val file_ = Source.fromURL("http://spark.apache.org")
    for (line <- file_.getLines())
      println(line)
  }
}
