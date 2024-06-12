package com.example.caculator

import com.example.caculator_lv1.AddOperation
import com.example.caculator_lv1.Calculator
import com.example.caculator_lv1.DivideOperation
import com.example.caculator_lv1.MultiplyOperation
import com.example.caculator_lv1.SubtractOperation

fun main() {
    val addCalc = AddOperation()
    val subtractCalc = SubtractOperation()
    val multiplyCalc = MultiplyOperation()
    val divideCalc = DivideOperation()

    addCalc.operation(20, 10)
    subtractCalc.operation(10, 5)
    multiplyCalc.operation(10, 3)
    divideCalc.operation(60, 0)
}