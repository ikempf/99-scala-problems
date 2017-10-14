package com.ikempf

object Problem008 {

  def compress[A](l: List[A]): List[A] =
    l match {
      case a :: b :: t if a == b => compress(a +: t)
      case h :: t => h +: compress(t)
      case Nil => Nil
    }

  def compressFold[A](l: List[A]): List[A] =
    l.foldRight(List.empty[A]){(a, acc) =>
      if (acc.headOption.contains(a))
        acc
      else
        a +: acc
    }

  def compressFold2[A](l: List[A]): List[A] =
    l.foldRight(List.empty[A])((a, acc) => acc.headOption.filter(_ == a).map(_ => acc).getOrElse(a +: acc))

}