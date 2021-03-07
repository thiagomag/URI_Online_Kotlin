import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val vetor = arrayOfNulls<Int>(20)

    for (i in 19 downTo 0) {
        val x = input.nextInt()
        vetor[i] = x
    }
    for (i in 0 until 20){
        val y = vetor[i]
        println("N[$i] = $y")
    }
}