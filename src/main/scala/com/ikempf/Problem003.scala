package com.ikempf

import scala.annotation.tailrec

object Problem003 {

  @tailrec
  def findNth[A](l: List[A], n: Int): A =
    (n, l) match {
      case (0, h +: _) => h
      case (k, _ +: t) => findNth(t, k - 1)
      case _ => throw new NoSuchElementException
    }

}