import java.util.*

fun main(args: Array<String>) {

    val pontos = Scanner(System.`in`)
    val x = pontos.nextFloat()
    val y = pontos.nextFloat()


    if (x.equals(0.0F) && y.equals(0.0F)) {
            println("Origem\n")
    } else if (x.equals(0.0F)) {
        println("Eixo Y\n")
    } else if (y.equals(0.0F)) {
        println("Eixo X\n")
    } else if (x < 0 && y > 0) {
        println("Q2\n");
    } else if (x > 0 && y > 0){
        println("Q1\n");
    } else if (x < 0 && y < 0) {
        println("Q3\n");
    } else {
        println("Q4\n");
    }
}