package com.concept.scala

/** *
  *
  * @see https://leetcode.com/problems/two-sum/
  * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  * You may assume that each input would have exactly one solution, and you may not use the same element twice.
  *
  */
object TwoSum extends App {

  /*
  def main(args: Array[String]): Unit = {
    val target = 6
    val nums = Array(3, 3)

    println(twoSum(nums, target).mkString(","))
  }


  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val count_tracker = scala.collection.mutable.HashMap[Int, Int]()

    for (i <- nums.indices) {

      val differrence = target - nums(i)

      if (count_tracker.contains(differrence))
        return Array(count_tracker(differrence), i)
      else
        count_tracker.put(nums(i), i)

    }
    count_tracker.toArray.map { case (_, y) => y }

  }


   */
  val numss = Array(2,7,11,15)
  val targets = 9

  val nums2 = Array(3,2,4)
  val target2 = 6

  def twoSums(nums:Array[Int],target:Int):Seq[Int]= {
   val count_tracker = nums.combinations(2).find(_.sum == target)
    count_tracker.get.toSeq
  }
  println(twoSums(numss,targets))
  println(twoSums(nums2,target2))


}
