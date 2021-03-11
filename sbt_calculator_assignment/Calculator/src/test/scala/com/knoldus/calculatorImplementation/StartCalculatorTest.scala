package com.knoldus.calculatorImplementation

import org.scalatest.flatspec.AnyFlatSpec

class StartCalculatorTest extends AnyFlatSpec{

  "StartCalculator"should "read input values" in{
     val res = StartCalculator.calculate.selectOperations(1,2,4)
    assertResult(6)(res)
  }

  it should "subtract" in {
    val res = StartCalculator.calculate.selectOperations(2,10,8)
    assertResult(2)(res)
  }

  it should "multiply" in {
    val res = StartCalculator.calculate.selectOperations(3,15,4)
    assertResult(60)(res)
  }

  it should "divide" in {
    val res = StartCalculator.calculate.selectOperations(4,80,8)
    assertResult(10.0)(res)
  }

  it should "not divide" in {
    val res = StartCalculator.calculate.selectOperations(4,80,0)
    assertResult("denominator cannot be zero")(res)
  }

  it should "give power of the value" in {
    val res = StartCalculator.calculate.selectOperations(5,10,2)
    assertResult(100)(res)
  }

  it should "give absolute number " in {
    val res = StartCalculator.calculate.selectOperations(6,-10,0)
    assertResult(10)(res)
  }

  it should "gives the remainder value" in {
    val res = StartCalculator.calculate.selectOperations(7,10,2)
    assertResult(0)(res)
  }

  it should "not gives the remainder value" in {
    val res = StartCalculator.calculate.selectOperations(7,10,0)
    assertResult("denominator cannot be zero")(res)
  }

  it should "give maximum value" in {
    val res = StartCalculator.calculate.selectOperations(8,45,19)
    assertResult(45)(res)
  }

  it should "give maximum value of" in {
    val res = StartCalculator.calculate.selectOperations(8,26,72)
    assertResult(72)(res)
  }

  it should "give both are equal" in {
    val res = StartCalculator.calculate.selectOperations(8,45,45)
    assertResult("Both numbers are equal")(res)
  }

  it should "give minimum value" in {
    val res = StartCalculator.calculate.selectOperations(9,72,22)
    assertResult(22)(res)
  }

  it should "give minimum value of" in {
    val res = StartCalculator.calculate.selectOperations(9,25,99)
    assertResult(25)(res)
  }

  it should "give equal" in {
    val res = StartCalculator.calculate.selectOperations(9,72,72)
    assertResult("Both numbers are equal")(res)
  }

}
