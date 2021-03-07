import java.util.*

fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    for (i in 2..n!! step 2) {
        val raiz = i * i
        println("$i^2 = $raiz")
    }
}