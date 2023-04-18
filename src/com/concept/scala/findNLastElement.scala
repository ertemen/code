package com.concept.scala

object findNLastElement extends App {


  def findNLastElement(ll: List[Any], n: Int): Any = {

    val listSize = ll.size
    val result = if (listSize > 0)
      ll(listSize - (n))
    else throw new NoSuchElementException

    result


  }

  def getFromLast(il: List[Int], positionFromLast: Int): Int = if (positionFromLast == il.size) il.head else getFromLast(il.tail, positionFromLast)

  def getFromLastV2(ll:List[Any],nlast:Int):Any = {
    val lll = ll.reverse.zipWithIndex // List((5,0), (4,1), (3,2), (2,3), (1,4)) value 5 with index
    println(lll)
    lll.filter(_._2==nlast-1).map(_._1).headOption

  }
  def nLargestValues(list: List[Int], n: Int): List[Int] = {
    list.sorted(Ordering[Int].reverse).take(n)
  }

  val list = List(5, 10, 3, 8, 2, 7, 9, 1, 6, 4)
  val n = 3

  val largestValues = nLargestValues(list, n)
  println(s"The $n largest values in the list are: $largestValues")

  println(findNLastElement(List(1, 2, 3, 4, 5), 2))

  println(findNLastElement(List("enis","menis","keriz"), 2))

  println(getFromLast(List(1, 2, 3, 4, 5), 2))
  println(getFromLastV2(List(45, 42,53, 5544, 453455,46456,78), 2))

}
