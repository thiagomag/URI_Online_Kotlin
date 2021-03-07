import java.util.*

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var pares = 0
    var impares = 0
    var positivo = 0
    var negativo = 0

    for (i in 0..4) {
        val x = input.nextDouble()
        if ((x % 2) == 0.0) {
            pares += 1
        } else {
            impares += 1
        }
        if (x > 0) {
            positivo += 1
        } else if (x < 0) {
            negativo += 1
        }
    }
    println("$pares valor(es) par(es)\n" +
            "$impares valor(es) impar(es)\n" +
            "$positivo valor(es) positivo(s)\n" +
            "$negativo valor(es) negativo(s)")
}