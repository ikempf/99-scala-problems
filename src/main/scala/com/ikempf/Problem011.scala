package com.ikempf

import com.ikempf.Problem010.encode

object Problem011 {

  def encodeOptimized[A](l: List[A]): List[Any] =
    encode(l).map {
      case (1, a) => a
      case t => t
    }

}