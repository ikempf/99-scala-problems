package com.ikempf

object Problem007 {

  def flatten[A](ll: List[List[A]]): List[A] =
    ll match {
      case hl :: t => hl ++ flatten(t)
      case Nil => Nil
    }

  def flattenEasy[A](ll: List[List[A]]): List[A] =
    ll.fold(List.empty)(_ ++ _)

  def flattenVeryEasy[A](ll: List[List[A]]): List[A] =
    ll.flatMap(identity)

  def flattenEasiest[A](ll: List[List[A]]): List[A] =
    ll.flatten

  def flattenAny(ll: List[Any]): List[Any] =
    ll match {
      case (h: List[_]) :: t => flattenAny(h) ++ flattenAny(t)
      case h :: t => h +: flattenAny(t)
      case l => l
    }

}