package com.knoldus

import scala.io.StdIn.readInt

class CalculatorImplementation {
  val calculate = new Calculator

  //to read the input values
  print("Enter first number : ")
  val first_number :Int = readInt()
  print("Enter second number : ")
  val second_number:Int = readInt()

  //function is used for selecting the required operation.
  def selectOperations(operation: Int): Unit = {
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
      case Addition =>
        val result = calculate.addition(first_number,second_number)
        print(s"Addition of $first_number and $second_number is $result ")

      case Subtraction =>
        val result = calculate.subtraction(first_number, second_number)
        print(s"Subtraction of $first_number and $second_number is $result")

      case Multiplication =>
        val result = calculate.multiplication(first_number, second_number)
        print(s"Multiplication of $first_number and $second_number is $result")

      case Division=>
        val result = calculate.division(first_number, second_number)
        print(s"Division of $first_number and $second_number is $result")

      case Power =>
        val result = calculate.power(first_number, second_number)
        print(s"$first_number to the power of $second_number is $result ")

      case Absolute =>
        val result1 = calculate.absolute(first_number)
        val result2 = calculate.absolute(second_number)
        print(s"Absolute of $first_number and $second_number is $result1 and $result2")

      case Modulus =>
        val result = calculate.modulus(first_number, second_number)
        print(s"Modulus of $first_number and $second_number is $result")

      case Maximum =>
        val result = calculate.maximumOfTwo(first_number, second_number)
        print(s"Maximum of $first_number and $second_number is $result")

      case Minimum =>
        val result = calculate.minimumOfTwo(first_number, second_number)
        print(s"Minimum of $first_number and $second_number is $result")

      case _ =>
        print("Invalid operation")
    }
  }
}

object StartCalculator {
  def main(args: Array[String]): Unit = {
    print("***************Calculator****************\n")
    val calculate = new CalculatorImplementation
    print("1. Add\n")
    print("2. Subtract\n")
    print("3. Multiplication\n")
    print("4. Division\n")
    print("5. Power\n")
    print("6. Absolute\n")
    print("7. Modulus\n")
    print("8. Maximum of Two\n")
    print("9. Minimum of Two\n")
    print("Select operation 1-9 : ")
    val operation = readInt()
    calculate.selectOperations(operation)
  }
}
