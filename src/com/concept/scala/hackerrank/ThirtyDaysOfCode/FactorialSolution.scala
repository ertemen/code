package com.concept.scala.hackerrank.ThirtyDaysOfCode

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.annotation.tailrec

object FactorialSolution {

    // Complete the factorial function below.
    def factorial(n: Int): Int = {
    @tailrec
    def f(acc: Int, fn: Int): Int = if (fn <= 0) acc else f(acc * fn, fn - 1)

    f(1, n)


    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val result = factorial(n)

        printWriter.println(result)

        printWriter.close()
    }
}
