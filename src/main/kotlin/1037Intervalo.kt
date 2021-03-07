import java.util.*

fun main(args: Array<String>) {

    val a = readLine()?.toDouble()

    if (a != null) {
        if (a in 0.0..25.0) {
            println("Intervalo [0,25]")
        } else if (a in 25.00001..50.0){
            println("Intervalo (25,50]")
        } else if(a in 50.00001..75.0){
            println("Intervalo (50,75]")
        } else if(a in 75.00001..100.0) {
            println("Intervalo (75,100]")
        } else {
            println("Fora de intervalo")
        }
    }

}