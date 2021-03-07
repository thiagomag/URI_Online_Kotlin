import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    val somaAB = a + b
    val somaCD = c + d


    if ( b > c && d > a && somaCD > somaAB && c > 0 && d > 0 ){
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }
}