package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem034.totient
import org.scalatest.{FlatSpec, Matchers}

class Problem034Test extends FlatSpec with Matchers {

  "Totient" should "determine the number of coprimes of given m" in {
    totient(10) should equal(4)
    totient(7) should equal(6)
  }

}
