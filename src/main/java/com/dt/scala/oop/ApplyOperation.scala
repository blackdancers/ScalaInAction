package com.dt.scala.oop

/**
 * apply 方法 在object和class中
 * 在object中通过实现apply的方式来构造相应类的实例!
 *
 */

/**
 * @author TongYing
 */
class ApplyTest() {
  def apply() = {
    println("I am into Spark so much !!!")
  }
  def haveATry {
    println("Have a try on apply!")
  }
}
/**
 * 伴生对象实现apply方法
 * @author TongYing
 */
object ApplyTest {
  def apply() = {
    println("I am into Scala so much !!!")
    new ApplyTest
  }
}

object ApplyOperation /*extends App*/{
  def main(args: Array[String]): Unit = {
//    val array_ = Array(2, 3, 4, 5, 6) // 
//    val a = ApplyTest() // class
//    a.haveATry
    
    
    val a = new ApplyTest
    a.haveATry
    println(a()) // 调用实例的appl方法
    
    
    
  }
}
































