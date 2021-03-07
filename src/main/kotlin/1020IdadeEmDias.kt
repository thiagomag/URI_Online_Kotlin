import java.util.*

fun main(args: Array<String>) {

    val anoEmDias = readLine()?.toInt()

    val anos = anoEmDias?.div(365)
    val anoEmDias2 = anoEmDias?.minus((anos?.times(365)!!))

    val mes = anoEmDias2?.div(30)
    val dias = anoEmDias2?.minus((mes?.times(30)!!))

    println("$anos ano(s)\n"+
            "$mes mes(es)\n"+
            "$dias dia(s)")
}