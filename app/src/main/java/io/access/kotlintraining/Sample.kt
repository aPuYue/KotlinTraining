package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function

fun hello() {
    println("Hello World!")
}



fun fizzBuzz(){

//    for (i in 1..100) {
//        println(
//                if (i % 15 == 0) "FizzBuzz"
//                else if (i % 3 == 0) "Fizz"
//                else if (i % 5 == 0) "Buzz"
//                else (i)
//
//        )
//    }


    for (i in 1..100) {
        println(
                when (true) {
                    i % 15 == 0 -> "FizzBuzz"
                    i % 3 == 0 -> "Fizz"
                    i % 5 == 0 -> "Buzz"
                    else -> i
                }
        )
    }
}


// うるう年かどうかを判定する関数
fun isLeapYear(y: Int): Boolean {
    // TODO: 実装する
    if ((y%4 == 0 && y%100 != 0) || y %400 == 0)
        return true
    else
        return false

}