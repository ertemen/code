package com.concept.scala

import scala.collection.mutable

object WordCount extends App {

  val wordcountMap = myCountWords("THIS COMMENT COPIED FROM REDDIT" +
    "Last I looked, scala jobs pay higher. " +
    "Yes, it is used for data processing and distributed programming a lot, but it also has an excellent web server (play) and supports a very sleek reactive framework (akka)" +
    "It's lambda implementation is also way more intuitive than Java's. " +
    "In other words, it is becoming a very versatile toolset." +
    "Also, ask any former java programmer with 6 months scala experience if they would like to go back to java. " +
    "I haven't yet met one. Enis Enis Enis Enis Enis Enis Enis ")


  def myCountWords(text:String) = {

    // keep the record of counts
    val counter = mutable.Map.empty[String,Int]

    // split the text into words removing punctuation
    for (rawWord <- text.split("[ ,!.]()+")) {
      val word = rawWord.toLowerCase

      val prev_counter = if (counter.contains(word) && word !="") counter(word)
      else 0
      counter+= (word -> (prev_counter +1))


    }
    counter
  }

  // sort by value ascending
  //wordcountMap.toList.sortBy(_._2).foreach(println)

  // top 5 by value (count)
  wordcountMap.toList.sortBy(-_._2).take(5).foreach(println)

  def wordAltCount(ll:List[String]):Map[String,Int] = {


    val mapValue = ll.flatMap(x => x.split(" ")).map(x => (x,1))
      .groupBy(x => x._1).transform((k,v) => v.size)

    mapValue
  }

  println(wordAltCount(List("Nirmal kumar", "Brindha devi", "Nirmal Raj", "Raj Narayan", "Narayan Murthy")).toList)
}
