package com.concept.scala

import scala.annotation.tailrec

object FindLastElement extends App {

  /**
    *  @example last(List(1, 1, 2, 3, 5, 8))
    *          res0: Int = 8 return List
    */

    @tailrec
  def findLast[T](list:List[T]):T  =  list match {
    case  element::Nil  => element
    case _ :: tail => findLast(tail)
    case _ => throw new NoSuchElementException("No elements in list")

  }

  println(findLast(List(1, 1, 2, 3, 5, 8)))
  println(findLast(List("enis","menis","keriz")))
}
