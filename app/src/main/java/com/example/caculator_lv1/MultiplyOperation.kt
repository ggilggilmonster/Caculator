package com.example.caculator_lv1

class MultiplyOperation : Calculator() {

    override fun operation(num1: Int, num2: Int) {
        val result = num1 * num2
        println("곱 : ${result}")
    }
}