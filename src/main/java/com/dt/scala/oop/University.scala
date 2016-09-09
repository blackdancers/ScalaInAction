package com.dt.scala.oop

/**
 * Scala单例对象、伴生对象
 *
 * 在Scala中没有静态类、成员或方法，但是提供了Object对象，类似于Java中的静态类
 *
 * 共享全局变量
 *
 */

/**
 * @author TongYing
 */
class University() {
  val id = University.newStudentNo
  private var number = 0
  def aClass(number: Int) {
    this.number += number
    println(University.stuNo)
  }
}
/**
 * 看作静态方法、变量
 * 也有构造器(第一次使用时生效)\隐形构造器 ，是class University伴生对象
 * 做一些属性配置,这个类可以访问它的所有成员（包括private）
 */
object University {
  private var stuNo = 0 // 变量
  def newStudentNo ={ //方法
    stuNo += 1
    stuNo
  }
}

object ObjectOps{
  def main(args: Array[String]): Unit = {
    println(University.newStudentNo)
    println(University.newStudentNo)
    // Array类的伴生对象构建
    val array_ = Array(2,3,4)
  }
}



















