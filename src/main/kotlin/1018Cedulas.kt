import java.util.*

fun main(args: Array<String>) {

    val valor = readLine()?.toInt()

    val notaCem = valor?.div(100)
    val valor2 = valor?.minus((notaCem?.times(100)!!))

    val notaCinquenta = valor2?.div(50)
    val valor3 = valor2?.minus((notaCinquenta?.times(50)!!))

    val notaVinte = valor3?.div(20)
    val valor4 = valor3?.minus((notaVinte?.times(20)!!))

    val notaDez = valor4?.div(10)
    val valor5 = valor4?.minus((notaDez?.times(10)!!))

    val notaCinco = valor5?.div(5)
    val valor6 = valor5?.minus((notaCinco?.times(5)!!))

    val notaDois = valor6?.div(2)
    val notaUm = valor6?.minus((notaDois?.times(2)!!))

    println("$valor\n" +
            "$notaCem nota(s) de R$ 100,00\n" +
            "$notaCinquenta nota(s) de R$ 50,00\n" +
            "$notaVinte nota(s) de R$ 20,00\n" +
            "$notaDez nota(s) de R$ 10,00\n" +
            "$notaCinco nota(s) de R$ 5,00\n" +
            "$notaDois nota(s) de R$ 2,00\n" +
            "$notaUm nota(s) de R$ 1,00")

}