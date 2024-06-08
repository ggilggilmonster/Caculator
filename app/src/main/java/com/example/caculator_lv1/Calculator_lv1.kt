package com.example.caculator_lv1

class Calculator {

    fun addOperation(num1: Double, num2: Double) : Double = AddOperation().addOperation(num1, num2)

    fun subtractOperation(num1: Double, num2: Double) : Double = SubtractOperation().subtractOperation(num1, num2)

    fun multiplyOperation(num1: Double, num2: Double) : Double = MultiplyOperation().multiplyOperation(num1, num2)

    fun divideOperation(num1: Double, num2: Double) : Double = DivideOperation().divideOperation(num1, num2)
}