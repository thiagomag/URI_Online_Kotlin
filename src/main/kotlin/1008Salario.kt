import java.util.*

fun main(args: Array<String>) {

    print("Informe o número do trabalhador: ")
    val nTrabalhador = Integer.valueOf(readLine())
    print("Informe quantidade de horas trabalhadas: ")
    val horaTrabalhada = Integer.valueOf(readLine())
    print("Informe o valor da hora trabalhada: ")
    val valorHora = readLine()?.toDouble()

    val salario = String.format("%.2f", horaTrabalhada * valorHora!!)

    println("NUMBER = $nTrabalhador\nSALARY = U$ $salario")

}
