package com.ikempf.lists

import com.ikempf.lists.Problem005.reverse
import org.scalatest.{FlatSpec, Matchers}

class Problem005Test extends FlatSpec with Matchers {

  "Reverse" should "reverse the lise" in {
    reverse(List(1, 2, 3, 4)) should equal(List(4, 3, 2, 1))
    reverse(List(1)) should equal(List(1))
  }

}
