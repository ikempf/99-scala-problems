package com.ikempf.lists

object Problem016 {

  def drop[A](n: Int, l: List[A]): List[A] = {
    def dropBis(m: Int, l: List[A]): List[A] =
      (m, l) match {
        case (_, Nil)    ⇒ Nil
        case (1, _ :: t) ⇒ dropBis(n, t)
        case (_, h :: t) ⇒ h +: dropBis(m - 1, t)
      }

    dropBis(n, l)
  }

  def dropEasy[A](n: Int, l: List[A]): List[A] =
    l.grouped(n).toList.flatMap(_.splitAt(n - 1)._1)

  def dropEasy2[A](n: Int, l: List[A]): List[A] =
    l.grouped(n).toList.flatMap {
      case group if group.length < n ⇒ group
      case group                     ⇒ group.init
    }

  def dropEasy3[A](n: Int, l: List[A]): List[A] =
    l.zipWithIndex
      .filter {
        case (_, i) ⇒ (i + 1) % n != 0
      }
      .map(_._1)

}
