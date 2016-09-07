package com.dt.scala.oop

/**
 * Scala 类的属性和对象的私有字段:
 * 在Scala的源文件中可以有很多类，默认是public级别的。
 *
 * Created by TongYing on 2016/9/7.
 */
class Person {
  /**
   * 可变私有成员变量，变量age必须赋值
   */
  private var age = 0

  /**
   * 方法
   */
  def increment(): Unit = {
    age += 1
  }

  /**
   * 方法(函数),没有参数可以省略()
   * @return Int
   */
  def current = age
}


/**
 * 在Scala类的定义中，声明一个属性(默认是private的),[在Java中一般声明变量是私有的，并且有getter和setter]
 * Scala与Java不一样，声明一个属性(默认是private级别，并且还会默认生成相应的get和set),
 * 例如:var age = 0 ==> private[this] var age: Int
 *  setter方法： def age_ =(x$1:Int):Unit
 *  getter方法： def age:Int
 *  ------------------------------------------------
 *  方法是可以访问这个类的所有对象的私有字段
 *
 */

class Student {

  var age = 0
  /**
   * 限定一个成员只能归当前对象所有
   */
  private[this] var size = 0
  // 重写变量的get方法
  def setSize = size

  /**
   *  private[this] val name:String 在程序运行中，会生成final类型的私有字段和get方法,并没有set方法
   */
  val name = "Scala"

  /**
   *  isYounger不能访问另外一个对象的私有成员(对象私有属性)
   * @param other
   * @return
   */
  def isYounger(other:Student):Boolean= {
//    size < other.size //Error
    size < other.age
  }

}


object HelloOOP {
  def main(args: Array[String]) {

    /*
    val person = new Person()

    person.increment()
    person.increment()
    println(person.current)
    */
    val student = new Student
    student.age = 20 // def age_ =(x$1:Int):Unit setter方法
    println(student.age) // def age:Int   getter方法
    println(student.setSize)
    println(student.name)
    //student.name = "abc" //Error
  }
}

