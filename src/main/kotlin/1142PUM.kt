import java.util.*

fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    if (n != null) {
        for (i in 0..(n-1)) {
            val a = 1 + (i * 4)
            val b = a + 1
            val c = b + 1
            println("$a $b $c PUM")
        }
    }
}