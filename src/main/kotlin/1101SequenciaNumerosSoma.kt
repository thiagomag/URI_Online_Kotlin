import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var m = input.nextInt()
    var n = input.nextInt()

    while (m > 0 && n > 0) {

        var soma = 0
        var x = m
        var y = n

        if (m > n) {
            x = n
            y = m
        }

        for (i in x..y) {
            soma += i
            print("$i ")
        }
        println("Sum=$soma")

        m = input.nextInt()
        n = input.nextInt()

    }
}