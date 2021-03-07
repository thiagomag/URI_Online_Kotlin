import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val vetor: MutableList<Double> = mutableListOf()

    for (i in 0..99) {
        val x = input.nextDouble()
        vetor.add(i, x)
            if (vetor[i] <= 10) {
                println("A[$i] = $x")
            }
    }
}