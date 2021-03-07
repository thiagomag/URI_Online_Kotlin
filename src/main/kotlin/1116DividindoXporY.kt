import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val n = input.nextInt()

    for (i in 1..n) {
        val x = input.nextFloat()
        val y = input.nextFloat()

        val div = x / y

        if (y > 0.0 || y < 0.0) {
            println(div)
        } else {
            println("divisao impossivel")
        }
    }
}