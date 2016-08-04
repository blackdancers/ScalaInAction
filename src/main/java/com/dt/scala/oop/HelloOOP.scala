package com.dt.scala.oop

/**
 * Scala OOP
 * 类的属性和对象私有属性字段
 *
 * Created by dancer on 7/27/2016.
 */
object HelloOOP {
  def main(args: Array[String]) {
    val person = new Person()
    person.increment()
    println(person.current)


    val student = new Student
    student.age = 10
    println(student.age)
    //student.name = "Hadoop" //不能赋值
    println(student.name)

  }

}

class Person{
  /**
   * age 必须赋值
   */
  private var age = 0
  def ags =  age;



  /**
   * 函数
   */
  def increment(){age+=1}

  /**
   * 函数没有参数可以省略
   * @return
   */
  def current = age
}

/**
 * 方法可以访问这个类的对象的所有字段（包括私有）
 */
class Student{

  //private var privateAge = 0
  //def  isYounger(other:Student) = privateAge < other.privateAge

  /**
   * 当前对象,
   */
  private[this] var privateAge = 0
  /**
   * 默认private，同时自动生成getter和setter
   */
  var  age = 0
  /**
   * final类型，只有getter
   */
  val name = "Scala"

  /**
   * 访问对象的私有属性
   * @param other
   * @return
   */
  //def  isYounger(other:Student) = privateAge < other.privateAge
}