package com.ikempf.lists

import com.ikempf.lists.Problem009.{pack, packFold, packSpan}
import org.scalatest.{FlatSpec, Matchers}

class Problem009Test extends FlatSpec with Matchers {

  "Pack" should "pack consecutive duplicates into sublists" in {
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
      List(List('a, 'a, 'a, 'a),
           List('b),
           List('c, 'c),
           List('a, 'a),
           List('d),
           List('e, 'e, 'e, 'e)))

    packFold(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
      List(List('a, 'a, 'a, 'a),
           List('b),
           List('c, 'c),
           List('a, 'a),
           List('d),
           List('e, 'e, 'e, 'e)))

    packSpan(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal(
      List(List('a, 'a, 'a, 'a),
           List('b),
           List('c, 'c),
           List('a, 'a),
           List('d),
           List('e, 'e, 'e, 'e)))
  }

}
