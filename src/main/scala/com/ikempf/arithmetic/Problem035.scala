package com.ikempf.arithmetic

import com.ikempf.arithmetic.Problem031.isPrime

object Problem035 {

  def primeFactors(n: Int): List[Int] =
    if (n <= 2) List.empty
    else
      primes
        .find(prime ⇒ n % prime == 0)
        .map(primeFactor ⇒ primeFactor +: primeFactors(n / primeFactor))
        .getOrElse(List(n))

  def primeFactorsSingleRun(n: Int): List[Int] = {
    def fold(rest: Int, primes: Stream[Int]): List[Int] =
      if (rest <= 2) List.empty
      else
        primes
          .find(prime ⇒ rest % prime == 0)
          .map(primeFactor ⇒ primeFactor +: fold(rest / primeFactor, primes.tail))
          .getOrElse(List(rest))

    fold(n, primes())
  }

  private def primes(): Stream[Int] =
    Stream.from(2).filter(isPrime)

}
