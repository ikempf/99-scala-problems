package com.ikempf

import com.ikempf.Problem021.{insertAt, insertAtEasy, insertAtEasy2}
import org.scalatest.{FlatSpec, Matchers}

class Problem021Test extends FlatSpec with Matchers {

  "InsertAt" should "insert element at given position" in {
    insertAt('new, 1, List('a, 'b, 'c, 'd)) should equal(List('a, 'new, 'b, 'c, 'd))
    insertAt('new, 50, List('a, 'b, 'c, 'd)) should equal(List('a, 'b, 'c, 'd, 'new))
    insertAt('new, -50, List('a, 'b, 'c, 'd)) should equal(List('new, 'a, 'b, 'c, 'd))

    insertAtEasy('new, 1, List('a, 'b, 'c, 'd)) should equal(List('a, 'new, 'b, 'c, 'd))
    insertAtEasy('new, 50, List('a, 'b, 'c, 'd)) should equal(List('a, 'b, 'c, 'd, 'new))
    insertAtEasy('new, -50, List('a, 'b, 'c, 'd)) should equal(List('new, 'a, 'b, 'c, 'd))

    insertAtEasy2('new, 1, List('a, 'b, 'c, 'd)) should equal(List('a, 'new, 'b, 'c, 'd))
    insertAtEasy2('new, 50, List('a, 'b, 'c, 'd)) should equal(List('a, 'b, 'c, 'd, 'new))
    insertAtEasy2('new, -50, List('a, 'b, 'c, 'd)) should equal(List('new, 'a, 'b, 'c, 'd))
  }

}
