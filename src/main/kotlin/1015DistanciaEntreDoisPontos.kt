import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {


    val pontos = Scanner(System.`in`).useLocale(Locale.ENGLISH)
    val x1 = pontos.nextDouble()
    val y1 = pontos.nextDouble()

    val x2 = pontos.nextDouble()
    val y2 = pontos.nextDouble()

    val distancia = String.format("%.4f", sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))

    println(distancia)

}
