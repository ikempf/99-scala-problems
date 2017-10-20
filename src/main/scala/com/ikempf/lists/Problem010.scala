package com.ikempf.lists

import com.ikempf.lists.Problem009.pack

object Problem010 {

  def encode[A](l: List[A]): List[(Int, A)] =
    pack(l).flatMap(packed ⇒ packed.headOption.map((packed.size, _)))

  def encodeNotTypesafe[A](l: List[A]): List[(Int, A)] =
    pack(l).map(packed ⇒ (packed.size, packed.head))

}
