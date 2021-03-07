import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val n = input.nextInt()
    var x: Int
    var y: Int


    for (i in 1..n) {
        x = input.nextInt()
        y = input.nextInt()
        var somaImpar = 0
        var cont = 0

        while (cont < y) {
            if (x % 2 !=0 ){
                somaImpar += x
                cont++
            }
            x++
        }
       println(somaImpar)
    }
}