import java.util.Scanner

fun main(args: Array<String>) {
    val matrix = array2dOfdouble(12, 12)

    val input = Scanner(System.`in`)

    val operacao = input.next()

    var soma = 0.0
    var count = 0.0

    for (i in 0..11) {
        for (j in 0..11) {
            matrix[i][j] = input.nextDouble()
            if (j < i) {
                soma += matrix[i][j]
                count += 1
            }
        }
    }

    val media = soma / count

    when (operacao) {
        "S" -> System.out.printf("%.1f\n", soma)
        "M" -> System.out.printf("%.1f\n", media)
    }
}

private fun array2dOfdouble(sizeOuter: Int, sizeInner: Int): Array<DoubleArray>
        = Array(sizeOuter) { DoubleArray(sizeInner) }