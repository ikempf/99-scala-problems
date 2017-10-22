package com.ikempf.arithmetic

import scala.annotation.tailrec

object Problem032 {

  def gcd(n: Int, m: Int): Int =
    Range
      .inclusive(1, Math.min(n, m))
      .reverse
      .toStream
      .find(k ⇒ n % k == 0 && m % k == 0)
      .get

  @tailrec
  def gcdEuclid(n: Int, m: Int): Int =
    if (n <= 0) m
    else gcdEuclid(m % n, n)

}
