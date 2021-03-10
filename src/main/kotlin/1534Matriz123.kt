import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var n = input.nextInt()

    val matriz = array2dOfint(n, n)

    for (i in 0 until n) {
        for (j in 0 until n) {
            when (i) {
                matriz.size - 1 - j -> matriz[i][j] = 2
                j -> matriz[i][j] = 1
                else -> matriz[i][j] = 3
            }
            print(matriz[i][j])
        }
        println()
    }
}

private fun array2dOfint(sizeOuter: Int, sizeInner: Int): Array<IntArray>
        = Array(sizeOuter) { IntArray(sizeInner) }