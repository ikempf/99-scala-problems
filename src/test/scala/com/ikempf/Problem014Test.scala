package com.ikempf

import com.ikempf.Problem014.{duplicate, duplicateEasy}
import org.scalatest.{FlatSpec, Matchers}

class Problem014Test extends FlatSpec with Matchers {

  "Duplicate" should "duplicate elements of a list" in {
    duplicate(List('a, 'b, 'c, 'c, 'd)) should equal(
      List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  "DuplicateFold" should "duplicate elements of a list" in {
    duplicateEasy(List('a, 'b, 'c, 'c, 'd)) should equal(
      List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

}
