import java.util.*

fun main(args: Array<String>) {
    for (i in 1..9 step 2) {
        for (j in 7 downTo 5) {
            val k1 = i + 6
            val k2 = i + 5
            val k3 = i + 4

            println("I=$i J=$k1")
            println("I=$i J=$k2")
            println("I=$i J=$k3")
        }
    }
}
