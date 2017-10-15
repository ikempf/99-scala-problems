package com.ikempf

object Problem018 {

  def slice[A](start: Int, end: Int, l: List[A]): List[A] =
    (start, end, l) match {
      case (_, 0, _) | (_, _, Nil) ⇒ Nil
      case (0, m, h :: t)          ⇒ h +: slice(0, m - 1, t)
      case (n, m, _ :: t)          ⇒ slice(n - 1, m - 1, t)
    }

  def sliceEasy[A](start: Int, end: Int, l: List[A]): List[A] =
    l.slice(start, end)

}
