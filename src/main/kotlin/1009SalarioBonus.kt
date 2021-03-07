import java.util.*

fun main(args: Array<String>) {

    val nome = readLine()
    val salario = readLine()?.toFloat()
    val vendas = readLine()?.toFloat()

    val salarioTotal = String.format("%.2f", salario!!.plus(vendas!!.times(0.15)))

    println("TOTAL = R$ $salarioTotal")

}