import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var n = 0
    var soma = 0
    var count = 0

    while (true) {
        n = input.nextInt()
        if (n < 0) break
        soma += n
        count += 1
    }
    val media = soma.toDouble() / count

    System.out.printf("%.2f", media)
}