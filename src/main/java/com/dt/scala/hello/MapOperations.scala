package com.dt.scala.hello

/**
 *
 * Created by dancer on 2016/6/21.
 */
object MapOperations {
  def main(args: Array[String]) {
    val ages = Map("Rocky" -> 28, "Spark" -> 5)
    for ((k, v) <- ages) {
      println("Key is " + k + ",value is " + v)
    }
    println("------------------------")
    for ((k, _) <- ages) { //placeholder 占位符
      println("Key is "+k)
    }

  }
}
