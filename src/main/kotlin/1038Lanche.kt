import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val cod = scanner.nextInt()
    val qtd = scanner.nextInt()

    val total1: String = String.format("%.2f", qtd * 4.00)
    val total2: String = String.format("%.2f", qtd * 4.50)
    val total3: String = String.format("%.2f", qtd * 5.00)
    val total4: String = String.format("%.2f", qtd * 2.00)
    val total5: String = String.format("%.2f", qtd * 1.50)


    when (cod) {
        1 -> println("TOTAL: R$ $total1")
        2 -> println("TOTAL: R$ $total2")
        3 -> println("TOTAL: R$ $total3")
        4 -> println("TOTAL: R$ $total4")
        else -> println("TOTAL: R$ $total5")
    }
}

