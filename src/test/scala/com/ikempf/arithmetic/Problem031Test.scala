package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem031.isPrime
import org.scalatest.{FlatSpec, Matchers}

class Problem031Test extends FlatSpec with Matchers {

  "IsPrime" should "determine whether a number is prime" in {
    isPrime(1) should be (true)
    isPrime(2) should be (true)
    isPrime(3) should be (true)
    isPrime(4) should be (false)
    isPrime(5) should be (true)
    isPrime(6) should be (false)
    isPrime(7) should be (true)
    isPrime(199) should be (true)
  }

}
