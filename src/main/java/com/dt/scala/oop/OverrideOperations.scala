package com.dt.scala.oop

/**
 * Scala中的继承：超类的构造、重写字段、重写方法
 *
 */

class Person1(val name: String, var age: Int) {
  println("The primary constructor of Person.")
  val school = "ABC"
  val score = 200
  def sleep = "8 hours"
  override def toString = "I am s student";

}

class Worker1(name: String, age: Int, val salary: Long) extends Person1(name, age) {
  println("This is the subClass of Person,Worker")
  override val school = "CSDN"
  override val score = 102
  override def toString = "I am a Worker," + super.sleep
}

object OverrideOperations {
  def main(args: Array[String]): Unit = {
    val w = new Worker1("Spark", 5, 10000)
    println("School:" + w.school)
    println("salary:" + w.salary)
    println(w.toString())
  }
}


















































