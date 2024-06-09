package com.example.caculator

import com.example.caculator_lv1.Calculator

fun main() {
    var num1 : Double = 0.0
    var num2 : Double = 0.0
    var operation : String = ""
    var calc : Double = 0.0
    var chooseProcess : Int = 0

    while(chooseProcess != 3) {
        println("계산기에 오신 걸 환영합니다.")
        println("1. 계산 시작 2. 추가 계산 3. 계산 중단")
        chooseProcess = readLine()!!.toInt()

        if (chooseProcess == 1) {
            println("첫번째 수를 입력하시오.")
            num1 = readLine()!!.toDouble()
            println("연산기호를 입력하시오. : +, -, *, /")

        } else if (chooseProcess == 2) {
            num1 = calc
            println("${calc}")
            println("연산기호를 입력하시오. : +, -, *, /")

        } else if (chooseProcess == 3) {
            println("계산 중단")
            break
        }

        operation = readLine()!!

        println("두번째 수를 입력하시오.")
        num2 = readLine()!!.toDouble()


        when (operation) {
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
                    println("0으로 나눌 수 없습니다. 계산기를 다시 실행해주세요.")
                    break

                } else {
                    calc = Calculator().divideOperation(num1, num2)
                }
            }
        }

        println("${num1} ${operation} ${num2} = ${calc}")
    }
}