package com.ikempf.lists

import com.ikempf.lists.Problem023.randomSelect

object Problem024 {

  def lotto(n: Int, set: Int): List[Int] =
    randomSelect(n, Range(0, set).toList)

}
