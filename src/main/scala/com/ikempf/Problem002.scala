package com.ikempf

import scala.annotation.tailrec

object Problem002 {

  @tailrec
  def penultimate[A](l: List[A]): A =
    l match {
      case h +: _ +: Nil => h
      case _ +: t => penultimate(t)
      case _ => throw new NoSuchElementException
    }

}