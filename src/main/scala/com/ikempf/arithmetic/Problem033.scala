package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem032.gcd

object Problem033 {

  def coprime(n: Int, m: Int): Boolean =
    gcd(n, m) == 1

}
