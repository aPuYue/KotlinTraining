package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}


// TODO: declare hello function

fun fizzBuzz(){
    var text: String = ""

    for(i in 1..100) {
        if(i%3 == 0 && i%5 == 0){
            text = text.plus("FizzBuzz ")
        } else if(i%3 == 0) {
            text = text.plus("fizz ")
        } else if(i%5 == 0){
            text = text.plus("buzz ")
        } else {
            text = text.plus(i.toString() + " ")
        }
    }
    print(text)
}

fun isLeapYear(year: Int) {
    if (year%100 != 0 && year%400 != 0 && year%4 == 0) {
        print("true")
    }
    print("false")
}

fun power(a: Int, n: Int) {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        print(0)
    }
    var sum = a
    for (i in 1..(n-1)) {
        sum = sum * a
    }
    print(sum)
}

fun Int.isOdd() {
    if (this % 2 != 0) {
        print("true")
    } else {
        print("false")
    }
}

fun Int.isEven() {
    if (this % 2 == 0) {
        print("true")
    } else {
        print("false")
    }
}

fun doDice() {
    val d = Dice(16)
    for (i in 1..100) {
        println(d.roll())
    }
    println(d.roll())
}

fun doCount() {
    val p = MyCustomClass()
    p.propertyWithCounter = 123
    p.propertyWithCounter = 456
    p.propertyWithCounter = 789
    print(p.counter) // 3
}

fun doNext() {
    var text: String = ""
    val n = NabeAtsu()
    for (i in 1..100) {
        text = text.plus(n.next() + " ")
    }
    print (text)
}


//エルビス演算子
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {

    client ?: return
    message ?: return
    val personalInfo = client.personalInfo ?: return
    val email = personalInfo.email ?: return
    mailer.sendMessage(email, message)
}


class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}