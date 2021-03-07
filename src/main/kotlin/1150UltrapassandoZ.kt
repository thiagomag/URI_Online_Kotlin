import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val x = input.nextInt()
    var z = input.nextInt()

    while (x >= z) {
       z = input.nextInt()
    }

    var somaX = 0
    var count = 0

    for (i in x..z) {
        somaX += i
        count += 1
        if (somaX > z) break
    }

   println(count)
}
