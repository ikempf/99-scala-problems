package com.ikempf

import com.ikempf.Problem024.lotto
import org.scalatest.{FlatSpec, FunSuite, Matchers}

class Problem024Test extends FlatSpec with Matchers {

  "Lotto" should "draw N different random numbers of a given set" in {
    println(lotto(6, 49))
    lotto(6, 49) should have size 6
  }

}
