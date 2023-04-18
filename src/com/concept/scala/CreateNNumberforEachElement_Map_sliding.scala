package com.concept.scala

object CreateNNumberforEachElement_Map_sliding extends App {


  def n_times_elements(o_list: List[Int], n: Int): List[List[Int]] = {


    val ind = 1
    val nlist: List[Int] = o_list.map(x => x + 1)

    nlist.sliding(n, ind).toList


  }

  def createListandSlide(n: Int): List[List[Int]] = {
    val my_list: List[Int] = (1 to n).toList.map((x => x + 1))

    my_list.sliding(2, 2).toList

  }

  println(n_times_elements(List(1, 2, 3, 4, 5), 3))
  println(createListandSlide(6))
}
