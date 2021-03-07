import java.util.*

fun main(args: Array<String>) {

    val n = Scanner(System.`in`)

    val a = n.nextFloat()
    val b = n.nextFloat()
    val c = n.nextFloat()

    if ( a + b > c && a + c > b && c + b > a) {
        val per = a + b + c
        println("Perimetro = $per")
    } else {
        val area = ((a + b) / 2) * c
        println("Area = $area")
    }

}
