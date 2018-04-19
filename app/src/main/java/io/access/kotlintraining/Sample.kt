package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function

fun hello() {
    println("Hello World!")
}



fun fizzBuzz(){



    for (i in 1..100) {
        println(
                if (i % 15 == 0) "FizzBuzz"
                else if (i % 3 == 0) "Fizz"
                else if (i % 5 == 0) "Buzz"
                else i)


    }
}