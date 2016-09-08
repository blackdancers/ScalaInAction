package com.dt.scala.oop

/**
 *
 * Scala 主构造器、私有构造器、构造器重载<br>
 * <p>1、Scala的构造器与Java的构造器有很大的不同，在定义Scala类的时候，可以为类传入参数，如果传入的参数是用var或val修饰的，
 * 那么在类实例化时，这些参数会成为类的实例的字段。</p>
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
  var name: String = _ //_占位符,私有成员,会自动生成共有的get和set方法 
  private var age = 27 //私有成员,会自动生成私有的get和set方法
  private[this] val gender = "male" //只属于当前的实例

  /**
   * 重载构造器,会调用主构造器
   */
  def this(name: String) {
    this //def Teacher(): Teacher 默认构造器
    this.name = name
  }

  def sayHello(): Unit = {
    println(this.name + ":" + this.age + ":" + this.gender)
  }
}

/**
 * 有时候不想别人使用默认构造器，我们只需要在类加上private即可，变成私有构造器
 * @author TongYing
 */
class Worker private(val name: String, val age: Int) {
  // 构造的时候变成成员变量
  println("This is the primary constructor!!")
  var gender: String = _
  println(gender)
  /**
   * 重载构造器
   */
  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

}

object OOPInScala {

  def main(args: Array[String]): Unit = {
    
    //val p = new Worker("Spark",5) //在类上加了private就不能使用默认的构造器了
    val p = new Worker("Spark",5,"famale")
    println(p.gender)
    /*
    val p = new Worker("Spark",5)
    println(p.age)
    println(p.gender)
     */
    /*
		val t1 = new Teacher
    t1.name = "Spark"
    t1.sayHello()
    */
    
  }

}


























