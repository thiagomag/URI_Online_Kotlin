import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val n = input.nextInt()


    for (i in 1..n){
        val x = input.nextInt()
        val y = input.nextInt()
        var a = x
        var b = y

        var somaImpares = 0

        if (x > y) {
            a = y
            b = x
        }

        for (j in a+1 until b){
            if (j % 2 != 0) {
                somaImpares += j
            }
        }
        println(somaImpares)
    }
}