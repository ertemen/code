package com.concept.scala

object option_Pattern extends App {

  def headOption[T](list: List[T]): Option[T] = { list match {
    case head => list.headOption
    case head::tail  =>  headOption(list.tail)
    case Nil => None
  }
  }

//println(headOption(List(1,2,3,4)))
  //println(headOption(List()))


  def sum(list: List[Int]): Int = {
    list match {
      case Nil=> 0
      case head::tail =>  head + sum(list.tail)
    }
  }

  def multiply(list: List[Int]): Int = {
    list match {
      case Nil=> 1
      case head::tail =>  head * multiply(list.tail)
    }
  }

  /**
    *
    * use n match {...}
    * fibonacci(n) = fibonacci(n -1) + fibonacci(n - 2)
    * base: fibonacci(0) => 0
    * fibonacci(1) => 1
    * fibonacci(< 0) => 0
    *
    */
  def fibonacci(n: Int): Int =  {
    n match {
      case 0 => 0
      case 1 => 1
      case x if x < 0 => 0
      case _ => fibonacci(n -1) + fibonacci(n - 2)
    }
  }

  def lastOption[T](l: List[T]): Option[T] = {
    l match {
      case Nil => None
      case head :: Nil => Some(head)
      case head :: tail => lastOption(tail)
    }
  }



  //println(multiply(List(1,2,3,4)))
  //println(multiply(List()))
  println(fibonacci(7))
  println(lastOption(List(1,2,3,4)))
  println(lastOption(List()))
}
