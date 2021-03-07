import java.util.*

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var pares = 0.0

    for (i in 0..4) {
        val x = input.nextDouble()
        if ((x % 2) == 0.0) {
            pares += 1
        }

    }
    System.out.printf("%.0f valores pares\n", pares)
}