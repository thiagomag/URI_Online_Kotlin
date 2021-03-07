import java.util.*

fun main(args: Array<String>) {

    var x: Double
    var s = 0.0

    for (i in 1..100) {
        x = (1.0 / i)
        s += x
    }
    System.out.printf("%.2f\n", s)
}
