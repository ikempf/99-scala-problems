package com.ikempf.lists

import com.ikempf.lists.Problem026.combinations
import org.scalatest.{FlatSpec, Matchers}

class Problem026Test extends FlatSpec with Matchers {

  "Combinations" should "generate combinations of K elements from the given list" in {
    combinations(3, List('a, 'b, 'c, 'd, 'e)) should equal(
      List(List('a, 'b, 'c),
           List('a, 'b, 'd),
           List('a, 'b, 'e),
           List('a, 'c, 'd),
           List('a, 'c, 'e),
           List('a, 'd, 'e),
           List('b, 'c, 'd),
           List('b, 'c, 'e),
           List('b, 'd, 'e),
           List('c, 'd, 'e)))
  }

}
