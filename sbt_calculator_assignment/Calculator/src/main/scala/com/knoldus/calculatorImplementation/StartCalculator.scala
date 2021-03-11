package com.knoldus.calculatorImplementation

import scala.io.StdIn.readInt

object StartCalculator extends App {
  print("***************Calculator****************\n")
  print("Select the operation to perform :\n")
 lazy val calculate = new CalculatorImplementation
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
  if(operation>=1 && operation<=9)
  {
    if(operation==6)
    {
      print("Enter the number: ")

      val number = io.StdIn.readInt()

      print(s"Result = ${calculate.selectOperations(operation,number,0)}")
    }
    else
      {
        //to read the input values
        print("Enter first number : ")
        val first_number :Int = readInt()
        print("Enter second number : ")
        val second_number:Int = readInt()
        print(s"Result = ${calculate.selectOperations(operation,first_number,second_number)}")
      }
  }
  else {
    print("Enter a valid number in the range of 1 to 9")
  }
}

