import java.util.*

fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    if (n != null) {
        if ((n % 2) == 0) {
            for (i in (n + 1)..(n + 12) step 2) {
                println(i)
            }
        } else {
            for (i in n..(n + 10) step 2) {
                println(i)
            }
        }
    }
}