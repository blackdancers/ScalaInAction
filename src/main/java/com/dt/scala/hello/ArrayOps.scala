package com.dt.scala.hello

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
 * 数组操作
 * Created by dancer on 7/27/2016.
 */
object ArrayOps {
  def main(args: Array[String]) {
    val nums = new Array[Int](10)
    val a = new Array[String](10)
    val s = Array("Hello", "Array")
    s(0) = "GoodBye"
    val b = ArrayBuffer[Int]()
    b += 1
    b +=(1, 2, 3, 5)
    b ++= Array(8, 10, 20)
    b +=(1, 2, 3, 4)
    b ++= Array(8, 10, 20)
    b.trimEnd(5)
    b.insert(2, 6)
    b.insert(2, 6, 6, 7, 8)
    b.remove(6)
    //val  c = b.toArray // c的值不可改变
    val c = Array(1, 3, 5, 7, 9, 11)
    /**
     * yield 结果，返回另一个数组
     */
    val result = for (elem <- c) yield 2 * elem
    for (elem <- c if elem % 2 == 0) yield 2 * elem

    /**
     * 对过滤后的元素*2
     */
    c.filter(_ % 2 == 0).map(2 * _)

    /**
     * 求和
     */
    Array(1, 3, 5, 7).sum

    /**
     * 最大值
     */
    ArrayBuffer("Mary", "had", "a", "little", "lamb").max

    /**
     * 排序,默认升序
     */
    val sb = ArrayBuffer(9, 17, 12, 2)
    sb.sorted
    val e = Array(11, 3, 25, 7)

    /**
     * 快速排序
     */
    Sorting.quickSort(e)
    println(e)

    /**
     * 连接符
     */
    e.mkString(" and ")
    a.mkString("<", ",", ">")

    /**
     * 矩阵，3行4列
     */
    val matrix = Array.ofDim[Double](3,4)
    matrix(2)(1) = 42
    /**
     * 数组嵌套
     */
    val triangle = new Array[Array[Int]](10)
    for (i <- 0 until (triangle.length))
      triangle(i) = new Array[Int](i + 1)
    //triangle

  }
}
