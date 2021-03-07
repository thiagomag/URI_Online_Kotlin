import java.util.*

fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    var dentro = 0
    var fora = 0

    for (i in 1..n!!) {
        val x = readLine()?.toInt()
        if (x in 10..20) {
            dentro += 1
        } else {
            fora += 1
        }
    }

    println("$dentro in\n$fora out")

}