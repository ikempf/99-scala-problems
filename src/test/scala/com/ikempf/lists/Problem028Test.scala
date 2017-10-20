package com.ikempf.lists

import com.ikempf.lists.Problem028.lsort
import org.scalatest.{FlatSpec, Matchers}

class Problem028Test extends FlatSpec with Matchers {

  "Lsort" should "sort a list of lists based on the sublist's length" in {
    lsort(
      List(List('a, 'b, 'c),
           List('d, 'e),
           List('f, 'g, 'h),
           List('d, 'e),
           List('i, 'j, 'k, 'l),
           List('m, 'n),
           List('o))) should equal(
      List(List('o),
           List('d, 'e),
           List('d, 'e),
           List('m, 'n),
           List('a, 'b, 'c),
           List('f, 'g, 'h),
           List('i, 'j, 'k, 'l)))
  }

}
