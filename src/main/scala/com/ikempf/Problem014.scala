package com.ikempf

object Problem014 {

  def duplicate[A](l: List[A]): List[A] =
    l match {
      case a :: t => a +: a +: duplicate(t)
      case Nil => Nil
    }

  def duplicateEasy[A](l: List[A]): List[A] =
    l.flatMap(List.fill(2)(_))

}