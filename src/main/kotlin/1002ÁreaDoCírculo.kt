import java.util.*

fun main(args: Array<String>) {

    val raio = readLine()?.toDouble()
    val n = 3.14159
    val area: String = String.format("%.4f", (n * raio!! * raio))

    println("A=$area")

}