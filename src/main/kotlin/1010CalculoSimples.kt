import java.util.*

fun main(args: Array<String>) {

    val peca = Scanner(System.`in`).useLocale(Locale.US) // o useLocale faz com que o input possa ser passado com "." ao invez de ","

    val codigo = peca.nextInt()
    val quantidade = peca.nextInt()
    val preco = peca.nextDouble()

    val codigo2 = peca.nextInt()
    val quantidade2 = peca.nextInt()
    val preco2 = peca.nextDouble()

    val total = String.format("%.2f", (quantidade * preco) + (quantidade2 * preco2))

    println("VALOR A PAGAR: R$ $total")

}