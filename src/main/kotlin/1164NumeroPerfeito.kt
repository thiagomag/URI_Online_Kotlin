import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val n = input.nextInt()

    for (i in 1..n) {

        val x = input.nextInt()

        var somaX = 0

        for (j in 1 until x) {
            somaX += j
            if (somaX >= x)
                break
        }
        if (somaX == x) {
            println("$x eh perfeito")
        } else {
            println("$x nao eh perfeito")
        }
    }
}