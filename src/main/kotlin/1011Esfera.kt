import java.util.*

fun main(args: Array<String>) {

    val raio = readLine()?.toDouble()
    val pi = 3.14159
    val volume: String = String.format("%.3f", ((4.0/3.0) * pi * raio!! * raio * raio))

    println("VOLUME = $volume")

}