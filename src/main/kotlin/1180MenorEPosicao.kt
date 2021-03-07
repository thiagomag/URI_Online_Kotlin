import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val n = input.nextInt()
    val vetor = IntArray(n)

    for (i in 0 until n) {
        vetor[i] = input.nextInt()
    }

    println("Menor valor: " + vetor.minOrNull())
    println("Posicao: " + vetor.minOrNull()?.let { vetor.indexOf(it) })
}
