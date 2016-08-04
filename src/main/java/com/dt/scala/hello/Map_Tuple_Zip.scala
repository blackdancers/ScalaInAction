package com.dt.scala.hello

/**
 * map类型
 * Created by dancer on 7/27/2016.
 */
object Map_Tuple_Zip {

  def main(args: Array[String]) {
    /**
     * Map:immutable不可变
     */
    val _map = Map("book" -> 10, "Run" -> 18, "ipad" -> 1000)
    for ((k, v) <- _map) yield (k, v * 0.9)
    /**
     * Map:mutable可变
     */
    val scores = scala.collection.mutable.Map("scala" -> 7, "hadoop" -> 10, "spark" -> 50)
    /**
     * 获得元素value，如果不存在key，返回0
     */
    val hadoopScore = scores.getOrElse("hadoop2", 0)

    /**
     * 添加(mutable可变)
     */
    scores += ("R" -> 9)

    /**
     * 删除(mutable可变)
     */
    scores -= "hadoop"

    /**
     * 排序
     */

    val sortedScore = scala.collection.immutable.SortedMap("scala" -> 17, "hadoop" -> 10, "spark" -> 50)
    /**
     *
     */
    val _tuple = (1,2,3.4,"scala","spark")
    val third = _tuple._3
    /**
     * 函数返回值
     */
    val (first,second,thirdd,fourth,fifth) =   _tuple
    /**
     * 取其中两个值
     */
    val (f,s,_,_,_) = _tuple
    /**
     * 判断大写元素，并组成一个集合，其他的组成一个集合
     */
    "Rocky Spark".partition(_.isUpper)

    /**
     * zip
     * 拉链操作
     */
    val symbols = Array("[","-","]")
    val counts = Array(2,5,2)
    val pairs = symbols.zip(counts)
    for ((x,y)<- pairs) Console.println(x*y)


















  }
}
