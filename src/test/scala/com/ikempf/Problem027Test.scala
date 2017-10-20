package com.ikempf

import com.ikempf.Problem027.{group, group3}
import org.scalatest.{FlatSpec, Matchers}

class Problem027Test extends FlatSpec with Matchers {

  "Group" should "group elements of a set into disjoint subsets" in {
    val input = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")

    group3(input).foreach(subsets ⇒ {
      subsets._1.forall(input.contains) should be(true)
      subsets._2.forall(input.contains) should be(true)
      subsets._3.forall(input.contains) should be(true)
    })

    group(List(2, 2, 5), input).forall(subsets ⇒
      subsets.forall(subset ⇒ subset.forall(input.contains))) should be(true)
  }

}
