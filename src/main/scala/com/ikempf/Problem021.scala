package com.ikempf

object Problem021 {

  def insertAt[A](a: A, pos: Int, l: List[A]): List[A] =
    (pos, l) match {
      case (_, t) if pos < 0 ⇒ a +: t
      case (_, Nil)          ⇒ a +: Nil
      case (0, h :: t)       ⇒ a +: h +: t
      case (_, h :: t)       ⇒ h +: insertAt(a, pos - 1, t)
    }

  def insertAtEasy[A](a: A, pos: Int, l: List[A]): List[A] = {
    val (start, end) = l.splitAt(pos)
    start ++ (a +: end)
  }

  def insertAtEasy2[A](a: A, pos: Int, l: List[A]): List[A] =
    l.slice(0, pos) ++ (a +: l.slice(pos, l.length))

}
