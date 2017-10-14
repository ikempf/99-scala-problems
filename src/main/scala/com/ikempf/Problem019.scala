package com.ikempf

import cats.instances.tuple._
import cats.syntax.bifoldable._

object Problem019 {

  // Rotate n steps to the left
  // can be n >= 0, n <= 0, n > l.length
  def rotate[A](n: Int, l: List[A]): List[A] = {
    val leftN = asSingleLeftRotation(n, l.length)
    rotateLeft(leftN, l, List.empty)
  }

  private def asSingleLeftRotation[A](n: Int, l: Int): Int =
    l - (Math.abs(n % l - l) % l)

  private def rotateLeft[A](n: Int, start: List[A], end: List[A]): List[A] =
    (n, start) match {
      case (0, _)      ⇒ start ++ end
      case (_, Nil)    ⇒ Nil
      case (_, h :: t) ⇒ rotateLeft(n - 1, t, end :+ h)
    }

  def rotateSplit[A](n: Int, l: List[A]): List[A] = {
    val leftN        = asSingleLeftRotation(n, l.length)
    val (start, end) = l.splitAt(leftN)
    end ++ start
  }

  def rotateFold[A](n: Int, l: List[A]): List[A] = {
    val leftN = asSingleLeftRotation(n, l.length)
    l.splitAt(leftN).bifoldLeft(List.empty[A])(_ ++ _, (c, end) ⇒ end ++ c)
  }

}
