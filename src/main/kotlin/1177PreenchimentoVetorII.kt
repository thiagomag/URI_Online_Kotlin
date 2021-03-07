import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val vetor = arrayOfNulls<Int>(1000)

    val n = input.nextInt()

    if(n in 2..50) {
        for (i in 0 until 1000) {
            vetor[i] = i%n
            System.out.printf("N[%d] = %d\n", i, vetor[i])
        }
    }
}