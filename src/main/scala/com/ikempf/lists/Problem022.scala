package com.ikempf.lists

object Problem022 {

  def range(start: Int, end: Int): List[Int] =
    if (start <= end)
      start +: range(start + 1, end)
    else
      Nil

  def rangeEasy(start: Int, end: Int): List[Int] =
    Range.inclusive(start, end).toList

  def rangeEasy2(start: Int, end: Int): List[Int] =
    List.tabulate(end - start + 1)(start + _)

}
