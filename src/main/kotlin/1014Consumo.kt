import java.util.*

fun main(args: Array<String>) {


    val distancia = readLine()?.toDouble()
    val combustivel = readLine()?.toDouble()

    val consumo = String.format("%.3f", distancia?.div(combustivel!!))


    println("$consumo km/l")
}