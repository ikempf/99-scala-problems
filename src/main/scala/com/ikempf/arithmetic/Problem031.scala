package com.ikempf.arithmetic

object Problem031 {

  def isPrime(n: Int): Boolean =
    Range(2, n - 1).forall(m ⇒ n % m != 0)

}
