package com.ikempf

import com.ikempf.Problem015.{duplicateN, duplicateNEasy}
import org.scalatest.{FlatSpec, Matchers}

class Problem015Test extends FlatSpec with Matchers {

  "DuplicateN" should "duplicate elements of a list N times" in {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should equal(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

  "DuplicateNEasy" should "duplicate elements of a list N times" in {
    duplicateNEasy(3, List('a, 'b, 'c, 'c, 'd)) should equal(List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

}