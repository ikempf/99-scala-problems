package com.ikempf.lists

import com.ikempf.lists.Problem023.{
  randomSelect,
  randomSelectDistinct,
  randomSelectDistinctNonRecursive
}
import org.scalatest.{FlatSpec, Matchers}

class Problem023Test extends FlatSpec with Matchers {

  "RandomSelect" should "extract given number of randomly selected elements from a list" in {
    randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) should have size 3

    randomSelectDistinct(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) should have size 3

    randomSelectDistinctNonRecursive(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) should have size 3
  }

}
