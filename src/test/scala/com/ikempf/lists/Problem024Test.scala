package com.ikempf.lists

import com.ikempf.lists.Problem024.lotto
import org.scalatest.{FlatSpec, Matchers}

class Problem024Test extends FlatSpec with Matchers {

  "Lotto" should "draw N different random numbers of a given set" in {
    println(lotto(6, 49))
    lotto(6, 49) should have size 6
  }

}
