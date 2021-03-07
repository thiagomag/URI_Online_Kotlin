import java.util.*

fun main(args: Array<String>) {

    print("Escolha um número: ")
    val a = Integer.valueOf(readLine())
    print("Escolha outro número: ")
    val b = Integer.valueOf(readLine())

    val prod = a * b
    println("PROD = $prod")

}