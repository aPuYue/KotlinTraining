package io.access.kotlintraining

/**
 * Created by ${puyue} on 2018/4/20.
 */

/**
 * ヌルとの戦い
 */

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