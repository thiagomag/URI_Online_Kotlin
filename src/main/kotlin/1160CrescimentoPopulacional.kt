import java.util.*


fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val n = input.nextInt()

    for (i in 1..n){
        var maxAnos = 101
        var cidadeA = input.nextInt()
        var cidadeB = input.nextInt()
        var crescA = input.nextDouble()
        var crescB = input.nextDouble()

        for (j in 0..99) {
            cidadeA = ((1 + (crescA / 100)) * cidadeA).toInt()
            cidadeB = ((1 + (crescB / 100)) * cidadeB).toInt()
            if (cidadeA > cidadeB) {
                maxAnos = j + 1
                break
            }
        }
        if (maxAnos > 100) {
            println("Mais de 1 seculo.")
        } else {
            println("$maxAnos anos.")
        }
    }
}