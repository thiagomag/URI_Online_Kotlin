import java.util.*

fun main(args: Array<String>) {

    val n = Scanner(System.`in`)

    val a = n.nextInt()
    val b = n.nextInt()
    val c = n.nextInt()

    if (b in (a + 1) until c) {
        println("$a\n$b\n$c")
    } else if (c in (a + 1) until b) {
        println("$a\n$c\n$b")
    } else if (a in (b + 1) until c) {
        println("$b\n$a\n$c")
    } else if (c in (b + 1) until a) {
        println("$b\n$c\n$a")
    } else if (a in (c + 1) until b) {
        println("$c\n$a\n$b")
    } else {
        println("$c\n$b\n$a")
    }

    println("\n$a\n$b\n$c")
}