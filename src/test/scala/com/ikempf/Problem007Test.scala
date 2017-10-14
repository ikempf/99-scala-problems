package com.ikempf

import com.ikempf.Problem007.{flatten, flattenAny}
import org.scalatest.{FlatSpec, Matchers}

class Problem007Test extends FlatSpec with Matchers {

  "Flatten" should "flatten a nested list structure" in {
    flatten(List(List(1), List(2, 3))) should equal(List(1, 2, 3))
  }

  "FlattenBis" should "flatten a randomly nested list structure" in {
    flattenAny(
      List(List(1),
           List(List(2), List(3)),
           List(List(4, List(5))),
           List(List(List(6), 7)))) should equal(List(1, 2, 3, 4, 5, 6, 7))
  }

}
