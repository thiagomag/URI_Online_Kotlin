import java.util.*

fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    for (i in 1..10) {
        val resultado = i * n!!
        println("$i x $n = $resultado")
    }
}