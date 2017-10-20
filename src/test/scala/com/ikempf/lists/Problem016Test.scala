package com.ikempf.lists

import com.ikempf.lists.Problem016.{drop, dropEasy, dropEasy2, dropEasy3}
import org.scalatest.{FlatSpec, Matchers}

class Problem016Test extends FlatSpec with Matchers {

  "Drop" should "drop nth element of the given list" in {
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))

    dropEasy(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))

    dropEasy2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))

    dropEasy3(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

}
