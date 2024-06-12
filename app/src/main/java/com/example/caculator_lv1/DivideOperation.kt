package com.example.caculator_lv1

class DivideOperation : Calculator() {

    override fun operation(num1: Int, num2: Int) {
        if(num2 != 0) {
            val result = num1 / num2
            println("몫 : ${result}")
        } else {
                println("0으로 나눌 수 없습니다.")
        }
    }
}