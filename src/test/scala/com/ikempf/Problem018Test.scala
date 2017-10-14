package com.ikempf

import com.ikempf.Problem018.{slice, sliceEasy}
import org.scalatest.{FlatSpec, Matchers}

class Problem018Test extends FlatSpec with Matchers {

  "Slice" should "extract a slice of a given list" in {
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(List('d, 'e, 'f, 'g))
    sliceEasy(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(List('d, 'e, 'f, 'g))
  }

}