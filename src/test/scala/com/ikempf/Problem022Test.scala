package com.ikempf

import com.ikempf.Problem022.{range, rangeEasy, rangeEasy2}
import org.scalatest.{FlatSpec, Matchers}

class Problem022Test extends FlatSpec with Matchers {

  "Range" should "create a list with all integers of given range" in {
    range(4, 9) should equal(List(4, 5, 6, 7, 8, 9))
    range(9, 9) should equal(List(9))
    range(10, 9) should equal(List())
    range(-5, 3) should equal(List(-5, -4, -3, -2, -1, 0, 1, 2, 3))

    rangeEasy(4, 9) should equal(List(4, 5, 6, 7, 8, 9))
    rangeEasy(9, 9) should equal(List(9))
    rangeEasy(10, 9) should equal(List())
    rangeEasy(-5, 3) should equal(List(-5, -4, -3, -2, -1, 0, 1, 2, 3))

    rangeEasy2(4, 9) should equal(List(4, 5, 6, 7, 8, 9))
    rangeEasy2(9, 9) should equal(List(9))
    rangeEasy2(10, 9) should equal(List())
    rangeEasy2(-5, 3) should equal(List(-5, -4, -3, -2, -1, 0, 1, 2, 3))
  }

}
