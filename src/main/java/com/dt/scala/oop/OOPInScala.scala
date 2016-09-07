package com.dt.scala.oop

/**
 *
 * Scala 主构造器、私有构造器、构造器重载
 * 1、Scala的构造器与Java的构造器有很大的不同，在定义Scala类的时候，可以为类传入参数，如果传入的参数是用var或val修饰的，
 * 那么在类实例化时，这些参数会成为类的实例的字段。
 *
 * 2、
 * 3、
 *
 *
 *
 *
 *
 * Created by TongYing on 2016/9/7.
 */

class Teacher {
  var name: String = _
  private var age = 27
  private[this] val gender = "male"

  def this(name: String) {
    this
    this.name = name
  }

  def sayHello(): Unit = {
    println(this.name + ":" + this.age + ":" + this.gender)
  }
}


object OOPInScala {

}
