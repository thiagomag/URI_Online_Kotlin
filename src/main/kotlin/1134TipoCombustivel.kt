import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    var somaAlcool = 0
    var somaGasolina = 0
    var somaDiesel = 0

    while (true) {
        val n = input.nextInt()

        if (n !in 1..4) continue
        if (n == 4) break

            when (n) {
                1 -> somaAlcool += 1
                2 -> somaGasolina += 1
                3 -> somaDiesel += 1
            }
        }
    println("MUITO OBRIGADO")
    println("Alcool: $somaAlcool")
    println("Gasolina: $somaGasolina")
    println("Diesel: $somaDiesel")
}
