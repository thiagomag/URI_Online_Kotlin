/**import java.math.BigInteger
import java.util.*


fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val vetor = arrayOfNulls<BigInteger>(60)

    var n1 = BigInteger.ZERO
    var n2 = BigInteger.ONE

    val n = input.nextInt()

        for (i in 1..n) {
            for (j in 2 until 60) {
                vetor[0] = BigInteger.ZERO
                vetor[1] = BigInteger.ONE
                vetor[j] = n1 + n2
                n1 = n2
                n2 = vetor[j]!!
            }
            val x = input.nextInt()
            n1 = BigInteger.ZERO
            n2 = BigInteger.ONE
            val y = vetor[x]

            println("Fib($x) = $y")
        }
}**/


import java.util.*
import java.math.BigInteger

fun main(args: Array<String>) {
    val fib = generateSequence(BigInteger.ZERO to BigInteger.ONE) {
        it.second to it.first + it.second
    }.map { it.first }
    val fibo = fib.take(61).toList()

    val input = Scanner(System.`in`)
    val num = input.nextInt()

    for (j in 1..num) {
        val n = input.nextInt()
        val item = fibo[n]
        println("Fib($n) = $item")
    }
}