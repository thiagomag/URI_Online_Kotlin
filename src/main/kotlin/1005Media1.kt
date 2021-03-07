import java.util.*

fun main(args: Array<String>) {

    print("infore a primeira nota: ")
    val a = readLine()?.toFloat()
    print("infore a segunda nota: ")
    val b = readLine()?.toFloat()

    val media = ((a?.times(3.5))?.plus((b?.times(7.5)!!)))?.div(11) // (a*3.5)+(b*7.5)/11
    val mediaFormatado = String.format("%.5f", media)


    print("MEDIA = $mediaFormatado")
}
