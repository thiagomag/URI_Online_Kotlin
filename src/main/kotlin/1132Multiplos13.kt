import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val x = input.nextInt()
    val y = input.nextInt()

    var a = x
    var b = y

    var soma = 0

    if (x > y) {
        a = y
        b = x
    }

    for (i in a..b) {
        if ((i % 13) != 0) {
            soma += i
        }
    }
    println(soma)
}