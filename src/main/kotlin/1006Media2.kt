import java.util.*

fun main(args: Array<String>) {

    print("infore a primeira nota: ")
    val a = readLine()?.toFloat()
    print("infore a segunda nota: ")
    val b = readLine()?.toFloat()
    print("infore a terceira nota: ")
    val c = readLine()?.toFloat()

    val media = ((a?.times(2))?.plus((b?.times(3)!!))?.plus((c?.times(5)!!)))?.div(10) // (a*2)+(b*3)+(c*5)/10
    val mediaFormatado = String.format("%.1f", media)


    println("MEDIA = $mediaFormatado")
}
