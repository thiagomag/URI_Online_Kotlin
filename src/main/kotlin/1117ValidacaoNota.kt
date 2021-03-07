import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var count = 0
    var soma = 0.0

    while (count < 2) {
        val nota = input.nextFloat()
        if (nota > 0 && nota <= 10) {
            count += 1
            soma += nota
        } else {
            println("nota invalida")
        }
    }
    val media = soma / count
    println("media = $media")
}