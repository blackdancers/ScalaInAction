package com.dt.scala.out

/**
 * Scala 内部类
 *
 * Java中的内部类是纯属于外部类的。
 * Scala的内部类是纯属于对象的。外部类实例的内部类是不同的内容(与Java有很大的区别)
 *
 * 
 *
 * @author TongYing
 */
class Outer(val name: String) {

  /**
   * 内部类
   * val outer: Outer
   */
  outer => class Inner(val name: String) {

    def foo(b:Inner) = println("Outer:"+outer.name+" Inner:"+b.name)

  }

}

object InnerOOPInScala {
  def main(args: Array[String]): Unit = {
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")
    //构建内部类，内部类纯属于外部类的对象
    val inner1 = new outer1.Inner("Scala")
    val inner2 = new outer2.Inner("Java")
    inner1.foo(inner1)
    //inner1.foo(inner2) //Error
    inner2.foo(inner2)
  }
}






















