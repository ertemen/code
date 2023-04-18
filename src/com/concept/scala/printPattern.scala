package com.concept.scala

object printPattern extends App {
  /**
    * Two values
    * val pattern ="*-*"
    * val numRep = 5
    * OUTPUT: *-**-**-**-**-*
    *         *-**-**-**-*
    *         *-**-**-*
    *         *-**-*
    *         *-*
    */
  def paintPattern(pattern:String,repnumber:Int)= {
   for (i<- (1 to repnumber).reverse)
     {
       println(pattern*i)
     }
  }

  def paintPattern2(pattern:String,repnumber:Int) = {
    List.from((1 to repnumber).reverse).foreach(t => println(pattern * t))
  }

  def paintPattern3(pattern:String,repnumber:Int) = {
    List.from( 1 to repnumber).reverse.map(pattern * _).mkString("\n")
  }



  //paintPattern("*-*. ",5)
  //paintPattern2("*-*. ",5)
  println(paintPattern3("**--**. ",6))
}

