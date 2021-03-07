import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val vetor = mutableListOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

    for (i in 0..9) {
        var n = input.nextInt()
        if(n > 0){
            vetor[i] = n
        }
    }

    for (i in 0..9) {
        val item = vetor[i]
        println("X[$i] = $item")
    }
}