import java.util.Scanner

fun main(args: Array<String>) {
    val matrix = array2dOfdouble(12, 12)

    val input = Scanner(System.`in`)

    val operacao = input.next()

    var soma = 0.0

    for (i in 0 until (matrix.size)) {
        for (j in 0 until (matrix.size)) {
            matrix[i][j] = input.nextDouble()
            if (i != matrix.size - 1 - j) {
                if (i + j >= 12) {
                    soma += matrix[i][j]
                }
            }
        }
    }

    val media = soma / 66

    when (operacao) {
        "S" -> System.out.printf("%.1f\n", soma)
        "M" -> System.out.printf("%.1f\n", media)
    }
}

private fun array2dOfdouble(sizeOuter: Int, sizeInner: Int): Array<DoubleArray>
        = Array(sizeOuter) { DoubleArray(sizeInner) }