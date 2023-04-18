package com.concept.scala.NinetyNineProblems


object P06_Palindrome {

  /**
    *
    *
  /*
/*
/***
*// P06 (*) Find out whether a list is a palindrome.
*//     Example:
*//     scala> isPalindrome(List(1, 2, 3, 2, 1))
    * /     res0: Boolean = true
    */
  def isPalindrome_builtin[A](ls: List[A]): Boolean = ls == ls.reverse
  def isPalindromeFunctional[T](list: List[T]): Boolean = list ./:(List[T]()) { (a, b) => b :: a } == list
}
