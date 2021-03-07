import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var m = input.nextInt()
    var n = input.nextInt()

    while (m != n) {

        if (m < n) {
            println("Crescente")
        } else {
            println("Decrescente")
        }

        m = input.nextInt()
        n = input.nextInt()

    }
}