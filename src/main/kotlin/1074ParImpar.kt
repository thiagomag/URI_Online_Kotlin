/**import java.util.*

fun main(args: Array<String>) {

    val n1 = readLine()?.toInt()

    for (i in 1..n1!!) {
        val n2 = readLine()?.toInt()
        if (n2 != null) {
            when {
                n2 > 0 && i % 2 == 0 -> println("EVEN POSITIVE")
                n2 < 0 && i % 2 == 0 -> println("EVEN NEGATIVE")
                n2 > 0 && i % 2 != 0 -> println("ODD POSITIVE")
                n2 < 0 && i % 2 != 0 -> println("ODD NEGATIVE")
                n2 == 0 -> println("NULL")
            }
        }
    }
}**/

import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val n1 = input.nextInt()

    for (i in 1..n1) {
        val n2 = input.nextInt()
        if (n2 == 0) {
            println("NULL")
        } else if (n2 > 0 && i % 2 == 0) {
            println("EVEN POSITIVE")
        } else if (n2 < 0 && i % 2 == 0) {
            println("EVEN NEGATIVE")
        } else if (n2 > 0 && i % 2 != 0) {
            println("ODD POSITIVE")
        } else if (n2 < 0 && i % 2 != 0) {
            println("ODD NEGATIVE")
        }
    }
}
