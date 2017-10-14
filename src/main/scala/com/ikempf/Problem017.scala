package com.ikempf

object Problem017 {

  def split[A](n: Int, l: List[A]): (List[A], List[A]) =
    splitBis(n, List.empty, l)


  private def splitBis[A](n: Int, start: List[A], end: List[A]): (List[A], List[A]) =
    (n, end) match {
      case (1, h :: t) => (start :+ h, t)
      case (_, h :: t) => splitBis(n - 1, start :+ h, t)
      case (_, _) => (start, end)
    }

  def split2[A](n: Int, l: List[A]): (List[A], List[A]) =
    (n, l) match {
      case (0, t) => (Nil, t)
      case (_, Nil) => (Nil, Nil)
      case (m, h :: t) =>
        val (start, end) = split2(m - 1, t)
        (h :: start, end)
    }

  def splitEasy[A](n: Int, l: List[A]): (List[A], List[A]) =
    l.splitAt(n)


}