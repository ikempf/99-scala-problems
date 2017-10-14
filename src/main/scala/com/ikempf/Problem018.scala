package com.ikempf

object Problem018 {

  def slice[A](start: Int, end: Int, l: List[A]): List[A] =
    (start, end, l) match {
      case (n, m, _ :: t) => slice(n - 1, m - 1, t)
      case (0, m, h :: t) => h +: slice(0, m - 1, t)
      case (_, 0, _) | (_, _, Nil) => Nil
    }

  def sliceEasy[A](start: Int, end: Int, l: List[A]): List[A] =
    l.slice(start, end)

}