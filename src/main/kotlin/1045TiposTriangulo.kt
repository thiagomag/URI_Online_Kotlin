import java.util.*

fun main(args: Array<String>) {

    val n = Scanner(System.`in`)

    val x = n.nextFloat()
    val y = n.nextFloat()
    val z = n.nextFloat()

    if (x > 0 && y > 0 && z > 0) {
        var a = 0.0F
        var b = 0.0F
        var c = 0.0F

        if (x >= y && x >= z) {
            a = x
            b = y
            c = z
        } else if (y >= x && y >= z) {
            a = y
            b = x
            c = z
        } else if (z >= x && z >= y) {
            a = z
            b = x
            c = y
        }

        when {
            a >= (b + c) -> {
                println("NAO FORMA TRIANGULO")
            }
            (a * a).equals((b * b) + (c * c)) -> {
                println("TRIANGULO RETANGULO")
            }
            (a * a) > ((b * b) + (c * c)) -> {
                println("TRIANGULO OBTUSANGULO")
            }
            (a * a) < ((b * b) + (c * c)) -> {
                println("TRIANGULO ACUTANGULO")
            }
        }

        if (a.equals(b) && a.equals(c)) {
            println("TRIANGULO EQUILATERO")
        } else if (a.equals(b) || a.equals(c) || b.equals(c)) {
            println("TRIANGULO ISOSCELES")
        }
    }
}