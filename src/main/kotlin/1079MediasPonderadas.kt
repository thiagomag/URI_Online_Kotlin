import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val n = input.nextInt()

    for (i in 1..n) {

        val n1 = input.nextFloat()
        val n2 = input.nextFloat()
        val n3 = input.nextFloat()

        val media = String.format("%.1f", ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10)

        println(media)
    }
}