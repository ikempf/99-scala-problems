package com.ikempf

import java.util.NoSuchElementException

import scala.annotation.tailrec

object Problem001 {

  @tailrec
  def last[A](l: List[A]): A =
    l match {
      case Nil => throw new NoSuchElementException
      case h :: Nil => h
      case _ :: t => last(t)
    }

}