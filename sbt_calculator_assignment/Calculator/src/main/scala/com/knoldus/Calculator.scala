package com.knoldus

class Calculator {
  //Addition function
  def addition(first_number: Int, second_number: Int): Long = first_number + second_number

  //Subtraction function
  def subtraction(first_number: Int, second_number: Int): Long = first_number - second_number

  //Multiplication function
  def multiplication(first_number: Int, second_number: Int): Long = first_number * second_number

  //Division function
  def division(first_number: Int, second_number: Int): Any = {
    if (second_number == 0) {
      "denominator cannot be zero"
    } else {
      first_number/second_number
    }
  }

  //function to find power of a number
  def power(number: Int, power: Int): Double = scala.math.pow(number, power)

  //function to get absolute value of a number
  def absolute(number: Int): Int = Math.abs(number)

  //function to get remainder
  def modulus(first_number: Int, second_number: Int):Any = {
    if (second_number == 0) {
      "denominator cannot be zero"
    } else {
      first_number % second_number
    }
  }

  //function to check maximum of 2 numbers
  def maximumOfTwo(first_number: Int, second_number: Int):Any = {
    if (first_number > second_number) {
      first_number
    } else if (second_number > first_number) {
      second_number
    } else {
      "Both numbers are equal"
    }
  }

  //function to check minimum of 2 numbers
  def minimumOfTwo(first_number: Int, second_number: Int):Any = {
    if (first_number < second_number) {
      first_number
    } else if (second_number < first_number) {
      second_number
    }
    else {
      "Both numbers are equal"
    }
  }

}
