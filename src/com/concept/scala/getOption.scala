package com.concept.scala


object getOption extends App {

  /**
    *
    * Without using l.take nor l(index), create a function that will return the Some(element) at index n
    * otherwise None
    */
  def getOption[T](l: List[T], index: Int): Option[T] =
    if (index <0)
    None
    else {
      l match {
        case Nil => None
        case head::tail => if (index == 0) Some(head) else getOption(tail, index -1)
      }
    }

  /**
    * This implementation uses pattern matching to handle the case
    * where the list is empty (Nil) and the case where the
    * list is not empty (head :: tail).
    * If the index is less than 0, the function returns None.
    * If the index is 0, the function returns Some(head).
    * Otherwise, the function recursively calls itself with the tail of the list and the index decremented by 1.
    */
}
