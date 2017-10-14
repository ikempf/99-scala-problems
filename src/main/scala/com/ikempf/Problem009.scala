package com.ikempf

import cats.instances.tuple._
import cats.syntax.bifoldable._

object Problem009 {

  case class Fill[A](elem: A, count: Int) {
    def +(inc: Int): Fill[A] = Fill(elem, count + inc)

    def toList: List[A] = List.fill(count)(elem)
  }

  def pack[A](l: List[A]): List[List[A]] =
    l match {
      case a :: b :: t if a == b ⇒ packAcc(Fill(a, 2), t)
      case h :: t                ⇒ List(h) +: pack(t)
      case Nil                   ⇒ Nil
    }

  private def packAcc[A](acc: Fill[A], l: List[A]): List[List[A]] =
    l match {
      case h :: t if h == acc.elem ⇒ packAcc(acc + 1, t)
      case t                       ⇒ acc.toList +: pack(t)
    }

  def packFold[A](l: List[A]): List[List[A]] =
    l.foldRight((List.empty[A], List.empty[List[A]])) {
        case (a, (Nil, acc)) ⇒
          (List(a), acc)
        case (a, (currentPack, acc)) if currentPack.contains(a) ⇒
          (a +: currentPack, acc)
        case (a, (currentPack, acc)) ⇒
          (List(a), currentPack +: acc)
      }
      .bifoldLeft(List.empty[List[A]])(_ :+ _, _ ++ _)

  def packSpan[A](l: List[A]): List[List[A]] =
    l match {
      case Nil ⇒ Nil
      case h :: _ ⇒
        val (pack, rest) = l.span(_ == h)
        pack +: packSpan(rest)
    }

}
