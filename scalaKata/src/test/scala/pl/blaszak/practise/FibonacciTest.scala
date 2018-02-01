package pl.blaszak.practise

import org.scalatest.FunSuite

class FibonacciTest extends FunSuite {

  test("should calculate fib 1") {
    assert(Fibonacci.fib(1) === 1)
  }

  test("should calculate fib 2") {
    assert(Fibonacci.fib(2) === 1)
  }

  test("should calculate fib 4") {
    assert(Fibonacci.fib(4) === 3)
  }

  test("should calculate fib 5") {
    assert(Fibonacci.fib(5) === 5)
  }

  test("should calculate fib 6") {
    assert(Fibonacci.fib(6) === 8)
  }
}
