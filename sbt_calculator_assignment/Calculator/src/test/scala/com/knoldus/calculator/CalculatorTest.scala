package com.knoldus.calculator

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest extends AnyFlatSpec {
  val calculator = new Calculator

  //Addition Test Cases:
  //case-1
  "If we add two positive number " should " also give positive value " in {
    val res = calculator.addition(5,3)
    assert(res == 8)
  }

  //case-2
  "If we add two negative numbers" should " give negative value " in {
    val res = calculator.addition(-3, -2)
    assert(res == -5)
  }

  //case-3
  "If we add one positive and one negative number" should " add those numbers" in {
    val res = calculator.addition(-3, 5)
    assert(res == 2)
  }

  //case-4
  "If we add any number with zero " should " give the number itself" in {
    val res = calculator.addition(0, 5)
    assert(res == 5)
  }

  //case-5
  "If we add equal values" should "give double of the number" in {
    val res = calculator.addition(2, 2)
    assert(res == 4)
  }


  //Subtraction Test Cases:
  //case-1
  "If we subtract two numbers" should " give the subtracted value " in {
    val res = calculator.subtraction(8, 3)
    assert(res == 5)
  }

  //case-2
  "If we subtract any number with zero " should "give the number itself" in {
    val res = calculator.subtraction(10, 0)
    assert(res == 10)
  }

  //case-3
  "If we subtract zero with any number" should "give negative number of that number" in {
    val res = calculator.subtraction(0, 5)
    assert(res == -5)
  }

  //case-4
  "If we subtract two negative numbers" should "give subtracted value of the numbers" in {
    val res = calculator.subtraction(-5, -3)
    assert(res == -2)
  }

  //case-5
  "If we subtract one positive number and one negative number" should "give added value" in {
    val res = calculator.subtraction(5, -3)
    assert(res == 8)
  }


  //Multiplication Test Cases:
  //case-1
  "If we multiply two numbers" should "give multiplied value" in {
    val res = calculator.multiplication(10, 3)
    assert(res == 30)
  }

  //case-2
  "If we multiply a number a number with zero" should " give zero" in {
    val res = calculator.multiplication(10, 0)
    assert(res == 0)
  }

  //case-3
  "multiply one positive and one negative number" should "give negative value" in {
    val res = calculator.multiplication(5, -3)
    assert(res == -15)
  }


  //Division Test Cases
  //case-1
  "number " should " not divide by zero" in {
    val res = calculator.division(1, 0)
    assert(res == "denominator cannot be zero")
  }

  //case-2
  "division of two positive number " should "be positive value" in {
    val res = calculator.division(50, 10)
    assert(res == 5)
  }

  //case-3
  "zero divide with any number" should " be zero" in {
    val res = calculator.division(0, 5)
    assert(res == 0)
  }

  //Modulus
  //case-1
  "number" should " not calculate modulus if denominator is zero" in {
    val res = calculator.modulus(1, 0)
    assert(res == "denominator cannot be zero")
  }

  //case-2
  "modulus " should " be calculated if denominator is not zero" in {
    val res = calculator.modulus(15, 3)
    assert(res == 0)
  }


  //Maximum of two Test Cases:
  //case-1
  "first number" should "be returned if it is greater" in {
    val res = calculator.maximumOfTwo(10, 6)
    assert(res == 10)
  }

  //case-2
  "second number " should "be returned if it is greater" in {
    val res = calculator.maximumOfTwo(27, 56)
    assert(res == 56)
  }

  //case-3
  "for equal numbers" should "return both are equal" in {
    val res = calculator.maximumOfTwo(12, 12)
    assert(res == "Both numbers are equal")
  }


  //Minimum of two Test Cases:
  //case-1
  "first number" should "be returned if it is smaller" in {
    val res = calculator.minimumOfTwo(12, 45)
    assert(res == 12)
  }

  //case-2
  "second number" should "be returned if it is smaller" in {
    val res = calculator.minimumOfTwo(30, 10)
    assert(res == 10)
  }

  //case-3
  "for equal numbers" should "return equal" in {
    val res = calculator.minimumOfTwo(6, 6)
    assert(res == "Both numbers are equal")
  }


  //Power Test Cases:
  //case-1
  "power" should "be calculated for two numbers" in {
    val res = calculator.power(3, 2)
    assert(res == 9.0)
  }

  //case-2
  "any number power zero" should "one" in {
    val res = calculator.power(3, 0)
    assert(res == 1.0)
  }

  //case-3
  "any number power one" should "be same number" in {
    val res = calculator.power(15, 1)
    assert(res == 15.0)
  }


  //Absolute
  //case-1
  "negative number" should "give positive number" in {
    val res = calculator.absolute(-5)
    assert(res == 5)
  }

  //case-2
  "positive number" should "give positive number" in {
    val res = calculator.absolute( number = 9)
    assert(res == 9)
  }

}
