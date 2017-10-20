package com.ikempf.lists

import com.ikempf.lists.Problem003.findNth
import org.scalatest.{FlatSpec, Matchers}

class Problem003Test extends FlatSpec with Matchers {

  "FindNth" should "find nth element of the list" in {
    findNth(List(1, 2, 3), 0) should equal(1)
    findNth(List(1, 2, 3), 2) should equal(3)
  }

}