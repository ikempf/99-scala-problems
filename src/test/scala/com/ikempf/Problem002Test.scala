package com.ikempf

import com.ikempf.Problem002.penultimate
import org.scalatest.{FlatSpec, Matchers}

class Problem002Test extends FlatSpec with Matchers {

  "Penultimate" should "find the last but one element of a list" in {
    penultimate(List(1, 2, 3)) should equal(2)
  }

}