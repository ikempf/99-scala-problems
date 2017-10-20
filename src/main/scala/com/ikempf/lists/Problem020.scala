package com.ikempf.lists

import java.util.NoSuchElementException

object Problem020 {

  def removeAt[A](k: Int, l: List[A]): (List[A], A) =
    (k, l) match {
      case (0, h :: t) ⇒ (t, h)
      case (_, Nil)    ⇒ throw new NoSuchElementException
      case (_, h :: t) ⇒
        val (list, kth) = removeAt(k - 1, t)
        (h +: list, kth)
    }

  def removeAtEasy[A](k: Int, l: List[A]): (List[A], A) = {
    val (start, end) = l.splitAt(k)
    (start ++ end.tail, end.head)
  }

}
