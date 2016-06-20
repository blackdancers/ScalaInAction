package com.dt.scala.hello

/**
 * Created by dancer on 2016/6/20.
 */
object ScalaBasics {
  def looper(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a;
      b = temp
    }
    b
  }

  //  var line = ""
  //  do {
  //    println("Please input some words blow....")
  //    line = readLine()
  //    println("Read :" + line)
  //  } while (line != "")
  //
  def doWhile() {
    var line = ""
    do {
      line = readLine()
      println("Read: " + line)
    } while (line != "")
  }

  /**
   * val 定义常量
   * 返回值为空
   * @param args
   */
  def main(args: Array[String]): Unit = {
    //    println("This is Spark!!")
    //    println(looper(100, 298))
    //    doWhile
    var file_ = "scala.txt"
    if (!args.isEmpty) file_ = args(0)
    val file = if (!args.isEmpty) args(0) else "scala.xml"
    println(file)

    println(if (!args.isEmpty) args(0) else "Spark.xml")

    for (i <- 1.to(10)) //for (i <- 1 to 10)
      println("Number is : " + i)

    val files = (new java.io.File(".")).listFiles()
    for (file <- files) {
      println(file)
    }
  }
}
