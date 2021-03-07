import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    val delta = (b * b) - (4 * a * c)

    if (delta > 0 && a > 0 || a < 0){
        val r1 = String.format("%.5f", (-b + sqrt(delta)) / (2 * a))
        val r2 = String.format("%.5f", (-b - sqrt(delta)) / (2 * a))

        println("R1 = $r1\n" +
                "R2 = $r2")

    } else {
        println("Impossivel calcular")
    }
}