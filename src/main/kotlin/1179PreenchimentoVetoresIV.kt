import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val vetorImpar = IntArray(5)
    val vetorPar = IntArray(5)
    var posPar = 0
    var posImpar = 0


    for (i in 1..15) {
        var n = input.nextInt()

        if (n % 2 == 0) {
            vetorPar[posPar] = n
            posPar++
        } else {
            vetorImpar[posImpar] = n
            posImpar++
        }
        if((posImpar == 5) or (i ==15)){
            for (j in 0 until posImpar) {
                println("impar[$j] = " + vetorImpar[j])
                posImpar = 0
            }
        }
        if((posPar == 5) or (i ==15)){
            for (j in 0 until posPar) {
                println("par[$j] = " + vetorPar[j])
                posPar = 0
            }
        }
    }

}