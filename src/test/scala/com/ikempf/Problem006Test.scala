package com.ikempf

import com.ikempf.Problem006.isPalindrome
import org.scalatest.{FlatSpec, Matchers}

class Problem006Test extends FlatSpec with Matchers {

  "IsPalindrome" should "find out wether a list is a plidrome" in {
    isPalindrome(List(1, 2, 3)) should be(false)
    isPalindrome(List(1, 2, 1)) should be(true)
    isPalindrome(List(1, 2, 2, 1)) should be(true)
    isPalindrome(List(0, 0, 0, 1, 5, 9, 5, 1, 0, 0, 0)) should be(true)
  }

}