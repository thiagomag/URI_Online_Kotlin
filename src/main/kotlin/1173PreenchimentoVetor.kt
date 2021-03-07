import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val vetor = mutableListOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

    var n = input.nextInt()

    if (n <= 50) {
        for (i in 0..9) {
            vetor[i] = n
            println("N[$i] = $n")
            n *= 2
        }
    }
}