package com.ikempf

import com.ikempf.Problem010.{encode, encodeNotTypesafe}
import org.scalatest.{FlatSpec, Matchers}

class Problem010Test extends FlatSpec with Matchers {

  "RunLengthEncoding" should "encode a list using run-length compression" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))

    encodeNotTypesafe(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  }

}
