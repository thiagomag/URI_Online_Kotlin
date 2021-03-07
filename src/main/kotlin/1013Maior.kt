import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (a >= b && a >= c) {
        println("$a eh o maior")
    } else if (b >= a && b >= c) {
        println("$b eh o maior")
    } else {
        println("$c eh o maior")
    }

}