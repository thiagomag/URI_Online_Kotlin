import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var positivos = 0
    var soma = 0.00

    for (i in 0..5) {
        val x = input.nextDouble()
        if (x > 0) {
            positivos += 1
            soma += x
        }
    }
    val media = String.format("%.1f", soma/positivos)
    println("$positivos valores positivos")
    println(media)
}

