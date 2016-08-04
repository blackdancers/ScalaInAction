val  _map = Map("book"->10,"Run"->18,"ipad"->1000)
for ((k,v)<-_map) yield (k,v*0.9)

val scores = scala.collection.mutable.Map("scala" -> 7, "hadoop" -> 10, "spark" -> 50)
val hadoopScore = scores.getOrElse("hadoop2", 0)

scores += ("R" -> 9)
scores -= "hadoop"

val sortedScore = scala.collection.immutable.SortedMap("scala" -> 17, "hadoop" -> 10, "spark" -> 50)

val _tuple = (1,2,3.4,"scala","spark")
val third = _tuple._3
val (first,second,thirdd,fourth,fifth) =   _tuple
val (f,s,_,_,_) =_tuple
/**
 * 判断大写元素，并组成一个集合，其他的组成一个集合
 */
"Rocky Spark".partition(_.isUpper)

val symbols = Array("[","-","]")
val counts = Array(2,5,2)
val pairs = symbols.zip(counts)
for ((x,y)<- pairs) Console.print(x*y)

