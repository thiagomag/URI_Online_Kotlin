import java.util.*

fun main(args: Array<String>) {

    val media = 12 //km/l
    val tempoViagem = readLine()?.toDouble() //hora
    val velocidadeMedia = readLine()?.toDouble() //km/h

    val distancia = velocidadeMedia?.times(tempoViagem!!)

    val combustivel = String.format("%.3f", distancia?.div(media))

    println(combustivel)

}