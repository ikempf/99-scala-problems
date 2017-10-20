package com.ikempf.lists

import com.ikempf.lists.Problem020.{removeAt, removeAtEasy}
import org.scalatest.{FlatSpec, Matchers}

class Problem020Test extends FlatSpec with Matchers {

  "RemoveK" should "remove kth element and return it alongside the list" in {
    removeAt(1, List('a, 'b, 'c, 'd)) should equal(List('a, 'c, 'd), 'b)
    removeAtEasy(1, List('a, 'b, 'c, 'd)) should equal(List('a, 'c, 'd), 'b)
  }

}
