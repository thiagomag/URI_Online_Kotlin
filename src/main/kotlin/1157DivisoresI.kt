import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val n = input.nextInt()

    for (i in 1..n){
        if(n % i == 0) {
            println(i)
        }
    }
}