package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem032.gcd
import org.scalatest.{FlatSpec, Matchers}

class Problem032Test extends FlatSpec with Matchers {

  "GCD" should "find the common greatest divisor between two integers" in {
    gcd(36, 63) should equal(9)
    gcd(3, 9) should equal(3)
    gcd(3, 8) should equal(1)
  }

}
