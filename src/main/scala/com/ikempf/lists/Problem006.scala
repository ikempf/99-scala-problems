package com.ikempf.lists

object Problem006 {

  def isPalindrome(l: List[_]): Boolean =
    l.drop(half(l)) == l.reverse.drop(half(l))

  private def half(l: List[_]) =
    l.size / 2

}