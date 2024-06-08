package com.example.caculator

import com.example.caculator_lv1.Calculator

fun main() {
    var num1 : Double = 0.0
    var num2 : Double = 0.0
    var operation : String = ""
    var calc : Double = 0.0


    println("첫번째 수를 입력하시오.")
    var num1 : Double = readLine()!!.toDouble()

    println("연산기호를 입력하시오. : +, -, *, /")
    var operation : String = readLine()!!

    println("두번째 수를 입력하시오.")
    var num2 : Double = readLine()!!.toDouble()


    when(operation) {
        "+" -> {
            calc = Calculator().addOperation(num1, num2)
        }
        "-" -> {
            calc = Calculator().subtractOperation(num1, num2)
        }
        "*" -> {
            calc = Calculator().multiplyOperation(num1, num2)
        }
        "/" -> {
            if (num2 == 0.0) {
                println("0으로 나눌 수 없습니다.")
            } else {
                calc = Calculator().divideOperation(num1, num2)
            }
        }
    }

    println("${num1} ${operation} ${num1} = ${calc}")
}