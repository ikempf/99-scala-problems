package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem033.coprime

object Problem034 {

  def totient(n: Int): Int =
    Range
      .inclusive(1, n)
      .count(m ⇒ coprime(n, m))

}
