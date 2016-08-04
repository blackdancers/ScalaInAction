package com.dt.scala.hello

/**
 *
 * Created by dancer on 7/25/2016.
 */
object For_Function_Advanced {

  def main(args: Array[String]): Unit = {
    //for (i <- 1 to 2;j <- 1 to 2) print(100*i+j+" ")
    //for (i <- 1 to 2;j <- 1 to 2 if i!=j) print(100*i+j+" ")
    // 定义函数，函数有"返回值",可以最为函数的参数去传递。函数式编程技巧
    def addA(x: Int) = x + 100
    // val常量, 此函数是"匿名函数"(常见用法,不关心函数的名字)
    val add = (x: Int) => x + 200 // 把函数值赋值给常量
    println("The result from a function is : " + addA(2))
    println("The result from a val is : " + add(2))

    // 特殊情况，函数返回值需要指定明确类型
    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
    println("The result from a fac is : " + fac(10))
    // 提供默认值
    def combine(content: String, left: String = "[", right: String = "]") = left + content + right
    println("The result from a combine is : " + combine("I love Spark"))
    //可变参数
    def connected(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }
    println("The result from a connected is : "+connected(1,2,3,4,5))

  }
}





















