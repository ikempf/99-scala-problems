package com.ikempf.lists

object Problem013 {

  def encodeDirectly[A](l: List[A]): List[(Int, A)] =
    l match {
      case a :: b :: t if a == b ⇒ encodeDirectlyAcc((2, a), t)
      case h :: t                ⇒ (1, h) +: encodeDirectly(t)
      case Nil                   ⇒ Nil
    }

  private def encodeDirectlyAcc[A](acc: (Int, A), l: List[A]): List[(Int, A)] =
    l match {
      case h :: t if h == acc._2 ⇒
        val accInc = acc.copy(_1 = acc._1 + 1)
        encodeDirectlyAcc(accInc, t)
      case t ⇒ acc +: encodeDirectly(t)
    }

  def encodeDirectlyFold[A](l: List[A]): List[(Int, A)] = {
    val (res, curr) =
      l.foldRight((List.empty[(Int, A)], Option.empty[(Int, A)])) {
        case (a, (acc, None)) ⇒ (acc, Some((1, a)))
        case (a, (acc, Some(currentAcc))) if currentAcc._2 == a ⇒
          (acc, Some(currentAcc.copy(_1 = currentAcc._1 + 1)))
        case (a, (acc, Some(currentAcc))) ⇒ (currentAcc +: acc, Some((1, a)))
      }

    curr.map(_ +: res).getOrElse(res)
  }

  def encodeDirectlySpan[A](l: List[A]): List[(Int, A)] =
    l match {
      case Nil ⇒ Nil
      case a :: _ ⇒
        val (span, tail) = l.span(_ == a)
        (span.length, a) +: encodeDirectlySpan(tail)
    }

}
