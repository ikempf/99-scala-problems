package com.ikempf.lists

import com.ikempf.lists.Problem019.{rotate, rotateFold, rotateSplit}
import org.scalatest.{FlatSpec, Matchers}

class Problem019Test extends FlatSpec with Matchers {

  "Rotate" should "rotate list n places to the left" in {
    rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    rotate(8, List('a, 'b, 'c)) should equal(List('c, 'a, 'b))
    rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))

    rotateSplit(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    rotateSplit(8, List('a, 'b, 'c)) should equal(List('c, 'a, 'b))
    rotateSplit(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))

    rotateFold(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    rotateFold(8, List('a, 'b, 'c)) should equal(List('c, 'a, 'b))
    rotateFold(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal(
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }

}
