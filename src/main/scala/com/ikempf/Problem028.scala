package com.ikempf

object Problem028 {

  def lsort[A](l: List[List[A]]): List[List[A]] =
    l.sortBy(_.length)

}
