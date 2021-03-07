import java.util.*

fun main(args: Array<String>) {

    val n = Scanner(System.`in`)

    val a = n.nextInt()
    val b = n.nextInt()

    val restoAB = a % b
    val restoBA = b % a

    if (restoAB == 0 || restoBA == 0){
        println("Sao Multiplos")
    } else {
        println("Nao sao Multiplos")
    }

}