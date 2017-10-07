package com.ikempf

object Problem005 {

  def reverse[A](l: List[A]): List[A] =
    l match {
      case h +: t => reverse(t) :+ h
      case Nil => Nil
    }

}