package com.ikempf

import scala.annotation.tailrec

object Problem004 {

  def length(l: List[_]): Int =
    lengthR(l, 0)

  @tailrec
  private def lengthR(l: List[_], length: Int): Int =
    l match {
      case _ +: t => lengthR(t, length + 1)
      case _ => length
    }

}