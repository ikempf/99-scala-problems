package com.ikempf.lists

import com.ikempf.lists.Problem002.penultimate
import org.scalatest.{FlatSpec, Matchers}

class Problem002Test extends FlatSpec with Matchers {

  "Penultimate" should "find the last but one element of a list" in {
    penultimate(List(1, 2, 3)) should equal(2)
  }

}