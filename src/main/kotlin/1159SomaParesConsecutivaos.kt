import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    while(true) {
        var n = input.nextInt()
        if (n == 0) break

        var somaPar = 0
        var count = 1

        while (count <= 5) {
            if (n % 2 == 0) {
                somaPar += n
                count++
            }
            n++
        }
        println(somaPar)
    }
}