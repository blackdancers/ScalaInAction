package com.dt.scala.oop

/**
 * Scala主构造器、私有构造器、构造器重载
 *
 * Created by dancer on 7/28/2016.
 */
/**
class Teacher {
  //必须赋值,可以使用占位符 _
  var name: String = _

  private var age = 27
  //只属于当前实例
  private[this] val gender = "male"

  def this(name: String) {
    this //必须有，是默认构造器，这里不带参数 this()
    this.name = name
    this.age = 33
  }

  def sayHello(): Unit = {
    println(this.name + ":" + this.age + ":" + this.gender)
  }
}
  */
/**
 * 主构造器可以加上private，外部就不可以调用了
 * @param name
 * @param age
 */

class Teacher private(val name: String, val age: Int) {
  println("This is the primary constructor!!")
  var gender: String = _
  println(gender)

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }
}

object OOPInScala {
  def main(args: Array[String]) {
    /**
    val p = new Teacher()
    p.name = "Spark"
    p.sayHello()

    */
    // 类在构造时，除了方法外都会被执行
//    val p = new Teacher("Spark",6)
//    println(p.age)

    /**
     * 重载构造器
     */
    val p2 = new Teacher("Spark",6,"famale")
    println(p2.age)
    println(p2.gender)

  }

}
