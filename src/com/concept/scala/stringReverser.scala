package com.concept.scala

/**
  * WordCount code To test the scala setup
  */
object stringReverser extends App {

  // calling the method on String directly
  def reverse1(s: String): String = {
    s.reverse
  }




  // recursively
  def reverse3(s: String): String = {
    val len = s.length
    if (len == 1) {
      s
    } else {
      reverse3(s.substring(1, len)) + s.charAt(0)
    }
  }

  // recursively, another one
  def reverse4(s: String): String = {
    val len = s.length
    if (len == 1) {
      s
    } else {
      s.substring(len - 1, len) + reverse4(s.substring(0, len - 1))
    }
  }


  // iterating backward through the string
  def reverse2(s: String): String = {
    val buf = new StringBuilder
    val len = s.length
    for (i <- 1 to len) {
      buf.append(s.charAt(len - i))
    }
    buf.toString
  }
  def reverse5(s: String): String = {
    val buff = new StringBuilder
    val len = s.length
    for (i <- 0 until len) {
      buff.append(s.charAt(len-i-1)) // get the last element and work backwards
    }
    buff.toString()
  }

  println(reverse1("eleman"))
  println(reverse2("eleman"))
  println(reverse5("eleman"))
}
