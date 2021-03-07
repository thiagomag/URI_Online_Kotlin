import java.util.*

fun main(args: Array<String>) {

    val renda = readLine()?.toDouble()

    val impostoPago = when {
        renda!! > 4500.00 -> ((renda - 4500.00) * 0.28 + (1500.00 * 0.18) + (1000.00 * 0.08))
        renda in 3000.01..4500.00 -> ((renda - 3000.00) * 0.18 + (1000.00 * 0.08))
        renda in 2000.01..3000.00 -> (renda - 2000.00) * 0.08
        else -> 0
    }

    if (impostoPago == 0) {
        println("Isento")
    } else {
        System.out.printf("R$ %.2f\n", impostoPago)
    }
}

