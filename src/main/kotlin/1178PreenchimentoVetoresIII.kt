import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val vetor = arrayOfNulls<Double>(100)

    var n = input.nextDouble()

    vetor[0] = n

    System.out.printf("N[0] = %.4f\n", vetor[0])

    for (i in 1..99) {
        vetor[i] = n/2
        n = vetor[i]!!

        System.out.printf("N[%d] = %.4f\n", i, n)
    }
}
