package com.ikempf

import com.ikempf.Problem012.decode
import org.scalatest.{FlatSpec, Matchers}

class Problem012Test extends FlatSpec with Matchers {

  "Decode" should "decode a run-length encoded list" in {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should equal(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

}