import java.util.*

fun main (args: Array<String>) {

    val input = Scanner(System.`in`)

    var x = input.nextInt()
    var y = input.nextInt()

    while (x != 0 && y != 0){

        when {
            x > 0 && y > 0 -> println("primeiro")
            x < 0 && y > 0 -> println("segundo")
            x < 0 && y < 0 -> println("terceiro")
            x > 0 && y < 0 -> println("quarto")
        }
        x = input.nextInt()
        y = input.nextInt()
    }
}