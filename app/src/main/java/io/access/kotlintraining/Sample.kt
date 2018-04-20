package io.access.kotlintraining
import java.util.*

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
                when  {  //这个地方不是函数不需要（true））
                    i % 15 == 0 -> "FizzBuzz"
                    i % 3 == 0 -> "Fizz"
                    i % 5 == 0 -> "Buzz"
                    else -> i
                }
        )
    }
}

fun fizzBuzz2(i:Int){



                if (i % 15 == 0) "FizzBuzz"
                else if (i % 3 == 0) "Fizz"
                else if (i % 5 == 0) "Buzz"
                else i.toString()




}


// うるう年かどうかを判定する関数
fun isLeapYear(y: Int): Boolean {
    // TODO: 実装する
    if ((y%4 == 0 && y%100 != 0) || y %400 == 0)
        return true
    else
        return false

}

fun power(a: Double, n: Double): Double {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0.toDouble()
    }
    // TODO: 実装する

    else
        return a*n//.toLong()
}

fun Int.isOdd() = this%2 != 0


fun Int.isEven()= this%2 == 0





class Dice(num:Int){
    var num :Int=100
    var con :Int=0
    fun roll(){

        if ( con<=100 && con>=1 ){
            val random = Random()
            val n = random.nextInt(num) // 0〜99 までの範囲の値がランダムで返る
            println(n)
        }
        else
            println("I was broken")

        con++
    }

}


class NabeAtsu {
    private var con: Int=0
    fun next(): String {
        con++
        if (con%3==0 || con.toString().contains("3")){

            return "Aho"
        }
        else
        {
            return con.toString()
        }
    }

}


//// コンパイル通すための諸々
//class Client (val personalInfo: PersonalInfo?)
//class PersonalInfo (val email: String?)
//interface Mailer {
//    fun sendMessage(email: String, message: String)
//}
//
////fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
//
//    if(client==null||message==null) return
//
//    var personalInfo:PersonalInfo? = client?.personalInfo
//    if(personalInfo==null) return
//
//    val email = personalInfo?.email
//    if(email==null) return
//
//    mailer.sendMessage(email, message)
//
//}

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

class MailerClass : Mailer{
    override fun sendMessage(email: String, message: String){
        println("message is :"+"$message")
    }
}




