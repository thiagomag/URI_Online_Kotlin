import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val n = input.nextInt()

    var coelhos = 0.0
    var ratos = 0.0
    var sapos = 0.0

    for (i in 1..n) {

        val qtdCobaia = input.nextFloat()
        val tipoCobaia = input.next()

        when (tipoCobaia) {
            "C" -> coelhos += qtdCobaia
            "R" -> ratos += qtdCobaia
            "S" -> sapos += qtdCobaia
        }
    }

    val totalCobaias = coelhos + ratos + sapos
    val percCoelhos = String.format("%.2f", (coelhos / totalCobaias)*100)
    val percRatos = String.format("%.2f", (ratos / totalCobaias)*100)
    val percSapos = String.format("%.2f", (sapos / totalCobaias)*100)

    System.out.printf("Total: %.0f cobaias\n", totalCobaias)
    System.out.printf("Total de coelhos: %.0f\n", coelhos)
    System.out.printf("Total de ratos: %.0f\n", ratos)
    System.out.printf("Total de sapos: %.0f\n", sapos)
    println("Percentual de coelhos: $percCoelhos %")
    println("Percentual de ratos: $percRatos %")
    println("Percentual de sapos: $percSapos %")
}