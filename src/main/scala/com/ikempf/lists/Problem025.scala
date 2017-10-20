package com.ikempf.lists

import com.ikempf.lists.Problem023.randomSelectDistinct

object Problem025 {

  def randomPermutation[A](l: List[A]): List[A] =
    randomSelectDistinct(l.length, l)

  def randomPermutateEasy[A](l: List[A]): List[A] =
    l.permutations.next()

}
