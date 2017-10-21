package com.ikempf.lists

import com.ikempf.lists.Problem025.{randomPermutateEasy, randomPermutation}
import org.scalatest.{FlatSpec, Matchers}

class Problem025Test extends FlatSpec with Matchers {

  "RandomPermutate" should "generate a random permutation of a given list" in {
    randomPermutation(List('a, 'b, 'c, 'd, 'e, 'f)) should contain theSameElementsAs List('f, 'a,
      'b, 'c, 'd, 'e)
    randomPermutateEasy(List('a, 'b, 'c, 'd, 'e, 'f)) should contain theSameElementsAs List('f, 'a,
      'b, 'c, 'd, 'e)
  }

}
