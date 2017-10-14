package com.ikempf

object Problem015 {

  def duplicateN[A](n: Int, l: List[A]): List[A] =
    l match {
      case a :: t ⇒ duplicateBis(a, n) ++ duplicateN(n, t)
      case Nil    ⇒ Nil
    }

  private def duplicateBis[A](a: A, left: Int): List[A] =
    left match {
      case 0 ⇒ Nil
      case n ⇒ a +: duplicateBis(a, n - 1)
    }

  def duplicateNEasy[A](n: Int, l: List[A]): List[A] =
    l.flatMap(List.fill(n)(_))

}
