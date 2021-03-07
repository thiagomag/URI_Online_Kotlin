import java.util.*

fun main(args: Array<String>) {


    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    val triangulo = String.format("%.3f", (c.let { a.times(it) }).div(2)) //  a*c/2
    val circulo = String.format("%.3f", 3.14159 * c * c)
    val trapezio = String.format("%.3f", ((b.let { a.plus(it) }).div(2)).times(c)) // ((a+b)/2)*c
    val quadrado = String.format("%.3f", b.times(b))
    val retangulo = String.format("%.3f", b.let { a.times(it) })

    println("TRIANGULO: $triangulo\nCIRCULO: $circulo\nTRAPEZIO: $trapezio\nQUADRADO: $quadrado\nRETANGULO: $retangulo")

}