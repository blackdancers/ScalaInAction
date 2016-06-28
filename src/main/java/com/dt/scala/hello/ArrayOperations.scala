package com.dt.scala.hello

/**
 * Created by dancer on 2016/6/21.
 */
object ArrayOperations {
  def main(args: Array[String]) {
    val array = Array(1, 2, 3, 4, 5)
    for (i <- 0 until array.length)
      println(array(i))

    println("-----------------------")
    for (elem <- array) println(elem)
  }

}
