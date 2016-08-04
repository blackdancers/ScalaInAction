import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

val s = Array("Hello", "Array")
s(0) = "Goodbye"
for (elem <- s)
  println(elem)
s
val nums = new Array[Int](10)
val a = new Array[String](10)
val b = ArrayBuffer[Int]()
b += 1
b +=(1,2,3,4)
b ++= Array(8,10,20)
b.trimEnd(5)
b.insert(2,6)
b.insert(2,6,6,7,8)
b.remove(6)
b.toArray


val c = Array(1,3,5,7,9,11)
/**
 * yield 结果，返回另一个数组
 */
val result = for (elem <- c) yield 2*elem
for (elem <- c if elem % 2==0) yield 2*elem

/**
 * 对过滤后的元素*2
 */
c.filter(_%2 ==0).map(2*_)

Array(1,3,5,7).sum

ArrayBuffer("Mary","had","a","little","lamb").max

val sb = ArrayBuffer(9,17,12,2)
sb.sorted
val e = Array(11,3,25,7)

/**
 * 快速排序
 */
Sorting.quickSort(e)
e
e.mkString(" and ")
b.mkString("<",",",">")

val matrix = Array.ofDim[Double](3,4)
matrix(2)(1)=42
matrix

val triangle = new Array[Array[Int]](10)
for (i<-0 until(triangle.length))
  triangle(i) = new Array[Int](i+1)
triangle