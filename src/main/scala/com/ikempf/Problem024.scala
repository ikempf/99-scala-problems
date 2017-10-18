package com.ikempf

import com.ikempf.Problem023.randomSelect

object Problem024 {

  def lotto(n: Int, set: Int): List[Int] =
    randomSelect(n, Range(0, set).toList)

}
