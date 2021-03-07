import java.util.*

fun main(args: Array<String>) {

    val tempo = readLine()?.toInt()

    val hora = tempo?.div(3600)
    val tempo2 = tempo?.minus((hora?.times(3600)!!))

    val minuto = tempo2?.div(60)
    val segundo = tempo2?.minus((minuto?.times(60)!!))

    println("$hora:$minuto:$segundo")

}