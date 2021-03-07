import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var n = input.nextInt()

    while (n != 0) {
        for (i in 1 until n) {
            print("$i ")
        }
        println(n)
        n = input.nextInt()
    }
}