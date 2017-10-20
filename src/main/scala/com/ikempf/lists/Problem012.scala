package com.ikempf.lists

object Problem012 {

  def decode[A](l: List[(Int, A)]): List[A] =
    l.flatMap {
      case (count, a) ⇒ List.fill(count)(a)
    }

  // Why does this not work :/, (A) =/= (=>A)
  //def decodeFp[A](l: List[(Int, A)]): List[A] = {
  //  val fill: Int => (=> A) => List[A] = List.fill[A](_: Int)
  //  val fillUncurried: (Int, => A) => List[A] = Function.uncurried(fill)
  //  val fillTupled: ((Int, (=> A))) => List[A] = fillUncurried.tupled
  //  l.flatMap(fillTupled)
  //}

}
