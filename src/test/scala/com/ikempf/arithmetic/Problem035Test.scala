package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem035.primeFactors
import com.ikempf.arithmetic.Problem035.primeFactorsSingleRun
import org.scalatest.FlatSpec
import org.scalatest.Matchers

class Problem035Test extends FlatSpec with Matchers {

  "PrimeFactors" should "determine prime factors of a given integer" in {
    primeFactors(315) should equal(List(3, 3, 5, 7))
    primeFactorsSingleRun(315) should equal(List(3, 3, 5, 7))
  }

}
