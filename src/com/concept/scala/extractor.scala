package com.concept.scala

object extractor extends App {

  /**
    *
    * In Scala, patterns can be defined using a method named unapply
    * to yield a so-called extractor. For instance, the following code defines an extractor object Twice
    *
    *
    * There are two syntactic conventions at work here:
    The pattern case Twice(n) will cause an invocation of Twice.unapply, which is used to match any even number;

    The return value of the unapply signals whether the argument has matched or not,
    and any sub-values that can be used for further matching. Here, the sub-value is z/2.

    The apply method is not necessary for pattern matching.
    It is only used to mimick a constructor.val x = Twice(21) expands to val x = Twice.apply(21).
    */

  object Twice {
    def apply(x: Int): Int = x * 2
    def unapply(z: Int): Option[Int] = if (z%2 == 0) Some(z/2) else None
  }

  val x = Twice(21)
  // println(x) // 42
  x match { case Twice(n) => Console.println(n) } // prints 21

  val y = Twice(22)
  // println(x) // 44
  y match { case Twice(n) => Console.println(n) } // prints 22

}
