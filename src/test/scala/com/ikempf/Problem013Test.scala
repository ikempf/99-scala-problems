package com.ikempf

import com.ikempf.Problem013.{encodeDirectly, encodeDirectlyFold, encodeDirectlySpan}
import org.scalatest.{FlatSpec, Matchers}

class Problem013Test extends FlatSpec with Matchers {

  "EncodeDirectly" should "encode list using run-length encoding" in {
    encodeDirectly(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    encodeDirectlyFold(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    encodeDirectlySpan(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  }

}