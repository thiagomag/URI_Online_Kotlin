import java.util.*

fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    for (i in 1..10000) {
        if (n != null) {
            if (i % n == 2) {
                val n2 = i
                println(n2)
            }
        }
    }
}