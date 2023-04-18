package com.concept.scala

object findLargestInt extends App {

  /**
    *  def max(n: Int): Int = {
    // populate
    val randomizer = new Random(n)
    var arr = new Array[Int](n)
    for (i <- 0 until n) {
      arr(i) = randomizer.nextInt(n)
    }
    println(">> input: " + arr.toList)
    // find max in list
    var max = 0
    arr.foreach(elem => if (max < elem) max = elem else max = max)
    max
  }
    */

  val ll  =List(3, 2, 4, 6, 5, 7, 8, 0, 1)

  def findMaxInt(lst:List[Int]):Int = {
    var max =0
    lst.foreach(elem => if (elem>max) max =elem else max =max)
    max
  }

  println(findMaxInt(ll))

}
