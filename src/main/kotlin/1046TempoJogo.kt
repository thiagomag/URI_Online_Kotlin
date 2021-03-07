import java.util.*

fun main(args: Array<String>) {

    val hora = Scanner(System.`in`)

    val horaInicio = hora.nextInt()
    val horaFinal = hora.nextInt()

    if (horaInicio in 0..24 && horaFinal in 0..24) {
        if (horaInicio >= horaFinal) {
            val tempoJogo = (24 - horaInicio) + horaFinal
            println("O JOGO DUROU $tempoJogo HORA(S)")
        } else {
            val tempoJogo = (horaFinal - horaInicio)
            println("O JOGO DUROU $tempoJogo HORA(S)")
        }
    } else {
        println("VALOR(ES) FORA DO RANGE")
    }
}