import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var n = input.nextInt()

    while (n != 0) {

        val matriz = array2dOfint(n+1, n+1)

        for (i in 0..n) {
            for (j in 0..n) {
                matriz[i][j] = 0
            }
        }
        for (i in 1..n) {
            for (j in 1..n){
                if (i == j) {
                    matriz[i][j] = 1
                } else {
                    matriz[i][j] = matriz[i][(j-1)] + 1
                }
            }
        }

        for (i in 1..n) {
            for (j in 1..n) {
                if (i > j) {
                    matriz[i][j] = matriz[j][i]
                }
                val item = matriz[i][j]
                if (j == 1) {
                    System.out.printf("%3d", item)
                } else {
                    System.out.printf(" %3d", item)
                }
            }
            println()
        }
        println()
        n = input.nextInt()
    }
}

private fun array2dOfint(sizeOuter: Int, sizeInner: Int): Array<IntArray>
        = Array(sizeOuter) { IntArray(sizeInner) }