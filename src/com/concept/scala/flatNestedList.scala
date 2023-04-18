package com.concept.scala

object flatNestedList extends App {
  /**
    * flat nested List
    * numList = List(1,2,3,List(3,4,5),List(7,8,9,List(10,12,34))
    * List(1,2,3,3,4,5,6,7,8,9,10,11,12,34)
    */

  /**
    * Use the flatten method to convert a list of lists into a single list
    */

  /**
    * Use the flatten method to convert a list of lists into a single list
    * ALTERNATIVELY
    * we can say that flatMap is a combination of map and flatten method.
    */
  def flatNestedList(ll:List[Any]):List[Any] ={
  ll flatten  {
    case element:List[_] => flatNestedList(element)
    case element=> List(element)
  }

}
  println(flatNestedList(List(1,2,3,List(3,4,5),List(7,8,9,List(10,12,34)))))
}
