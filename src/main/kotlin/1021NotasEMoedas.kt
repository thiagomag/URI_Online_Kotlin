import java.util.*

fun main(args: Array<String>) {

    val valor = readLine()?.toDouble()
    val notas = valor?.toInt()
    val moedas = ((notas?.let { valor.minus(it) })?.times(100))?.toInt()

    val notaCem = notas?.div(100)
    val notas2 = notas?.minus((notaCem?.times(100)!!))

    val notaCinquenta = notas2?.div(50)
    val notas3 = notas2?.minus((notaCinquenta?.times(50)!!))

    val notaVinte = notas3?.div(20)
    val notas4 = notas3?.minus((notaVinte?.times(20)!!))

    val notaDez = notas4?.div(10)
    val notas5 = notas4?.minus((notaDez?.times(10)!!))

    val notaCinco = notas5?.div(5)
    val notas6 = notas5?.minus((notaCinco?.times(5)!!))

    val notaDois = notas6?.div(2)
    val notas7 = notas6?.minus((notaDois?.times(2)!!))

    val moedaUmReal = notas7?.div(1)

    val moedaCinquenta = moedas?.div(50)
    val moedas2 = moedas?.minus((moedaCinquenta?.times(50)!!))

    val moedaVinteECinco = moedas2?.div(25)
    val moedas3 = moedas2?.minus((moedaVinteECinco?.times(25)!!))

    val moedaDez = moedas3?.div(10)
    val moedas4 = moedas3?.minus((moedaDez?.times(10)!!))

    val moedaCinco = moedas4?.div(5)
    val moedaUmCentavo = moedas4?.minus((moedaCinco?.times(5)!!))


    println("NOTAS:\n" +
            "$notaCem nota(s) de R$ 100.00\n" +
            "$notaCinquenta nota(s) de R$ 50.00\n" +
            "$notaVinte nota(s) de R$ 20.00\n" +
            "$notaDez nota(s) de R$ 10.00\n" +
            "$notaCinco nota(s) de R$ 5.00\n" +
            "$notaDois nota(s) de R$ 2.00\n" +
            "MOEDAS:\n" +
            "$moedaUmReal moeda(s) de R$ 1.00\n" +
            "$moedaCinquenta moeda(s) de R$ 0.50\n" +
            "$moedaVinteECinco moeda(s) de R$ 0.25\n" +
            "$moedaDez moeda(s) de R$ 0.10\n" +
            "$moedaCinco moeda(s) de R$ 0.05\n" +
            "$moedaUmCentavo moeda(s) de R$ 0.01")
}