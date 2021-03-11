package com.knoldus.calculatorImplementation

import com.knoldus.calculator.Calculator

class CalculatorImplementation {
  val calculate = new Calculator

  //function is used for selecting the required operation.
  def selectOperations(operation: Int,first_number:Int,second_number:Int): Any = {
    val Addition =1
    val Subtraction =2
    val Multiplication =3
    val Division =4
    val Power =5
    val Absolute =6
    val Modulus =7
    val Maximum =8
    val Minimum =9

    operation match {
      case Addition => calculate.addition(first_number, second_number)

      case Subtraction => calculate.subtraction(first_number, second_number)

      case Multiplication => calculate.multiplication(first_number, second_number)

      case Division=> calculate.division(first_number, second_number)

      case Power => calculate.power(first_number, second_number)

      case Absolute => calculate.absolute(first_number)

      case Modulus => calculate.modulus(first_number, second_number)

      case Maximum => calculate.maximumOfTwo(first_number, second_number)

      case Minimum => calculate.minimumOfTwo(first_number, second_number)

    }
  }
}