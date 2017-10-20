package com.ikempf.lists

import org.scalatest.{FlatSpec, Matchers}

class Problem004Test extends FlatSpec with Matchers {

  "Length" should "find the number of elements of the list" in {
    Problem004.length(List(1, 2, 3)) should equal(3)
    Problem004.length(List()) should equal(0)
  }

}
