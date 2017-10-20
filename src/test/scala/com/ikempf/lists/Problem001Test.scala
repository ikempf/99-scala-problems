package com.ikempf.lists

import com.ikempf.lists.Problem001.last
import org.scalatest.{FlatSpec, Matchers}

class Problem001Test extends FlatSpec with Matchers {

  "Last" should "find the last element of a list" in {
    last(List(1, 2, 3)) should equal(3)
  }

}