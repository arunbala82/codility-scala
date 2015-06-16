package com.codility.lessons

/**
 * MaxProductOfThree
 */
object MaxProductOfThree {

  def solution(A: Array[Int]): Int = {

    val N = A.length
    val sort = A.sorted
    math.max(sort(0) * sort(1) * sort(N - 1), sort(N - 1) * sort(N - 2) * sort(N - 3))
  }
}
