package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem033.coprime
import org.scalatest.{FlatSpec, Matchers}

class Problem033Test extends FlatSpec with Matchers {

  "Coprime" should "determine whether two numbers are coprime" in {
    coprime(35, 64) should be(true)
    coprime(9, 3) should be(false)
  }

}
