package com.ikempf.lists

import com.ikempf.lists.Problem026.combinations

object Problem027 {

  def group3[A](l: List[A]): List[(List[A], List[A], List[A])] =
    for {
      c2       ← combinations(2, l)
      lMinusC2 = l.filterNot(c2.contains)
      c3       ← combinations(3, lMinusC2)
      lMinusC3 = lMinusC2.filterNot(c3.contains)
    } yield (c2, c3, lMinusC3)

  def group[A](sizes: List[Int], l: List[A]): List[List[List[A]]] = {
    sizes match {
      case Nil ⇒ Nil
      case h :: t ⇒
        combinations(h, l)
          .flatMap(combination ��� group(t, l.filterNot(combination.contains)).map(combination +: _))
    }
  }

}
