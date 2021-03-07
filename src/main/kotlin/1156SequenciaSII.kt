import java.util.*

fun main(args: Array<String>) {


    var s = 0.0
    var y = 1.0

    for (i in 1..39 step 2) {

        s += i/y
        y *= 2


    }
    System.out.printf("%.2f\n", s)
}
