package com.ikempf

import com.ikempf.Problem020.removeAt

import scala.util.Random

object Problem023 {

  def randomSelect[A](n: Int, l: List[A]): List[A] =
    Range(0, n)
      .map(_ => Random.nextInt(l.length))
      .map(l.apply)
      .toList

  def randomSelectDistinct[A](n: Int, l: List[A]): List[A] =
    if (n <= 0) {
      List.empty[A]
    } else {
      val (rest, removed) = removeAt[A](Random.nextInt(n), l)
      removed +: randomSelectDistinct(n - 1, rest)
    }

  def randomSelectDistinctNonRecursive[A](n: Int, l: List[A]): List[A] = {
    val elementsToDrop = l.length - 1 - n

    val decreasingListSize = Range(0, elementsToDrop)
      .scanLeft(l.length - 1)((acc, _) => acc - 1)
      .toList

    decreasingListSize
      .map(Random.nextInt)
      .foldLeft(l)((acc, rand) => removeAt(rand, acc)._1)
  }

}