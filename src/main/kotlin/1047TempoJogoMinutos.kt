/**import java.util.*

fun main(args: Array<String>) {

    val hora = Scanner(System.`in`)

    val horaInicio = hora.nextInt()
    val minInicio = hora.nextInt()
    val horaFinal = hora.nextInt()
    val minFinal = hora.nextInt()

    if (horaInicio in 0..24 && minInicio in 0..60 && horaFinal in 0..24 && minFinal in 0..60) {
        if (horaInicio > horaFinal) {
            val horaJogo = (24 - horaInicio) + horaFinal
            if (minInicio >= minFinal) {
                val minJogo = (60 - minInicio) + minFinal
                if (minJogo == 60) {
                    val minJogo = 0
                    println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
                } else {
                    val horaJogo = horaJogo - 1
                    println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
                }
            } else {
                val minJogo = (minFinal - minInicio)
                println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
            }

        } else if (horaFinal > horaInicio){
            val horaJogo = (horaFinal - horaInicio)
            if (minInicio >= minFinal) {
                val minJogo = (60 - minInicio) + minFinal
                if (minJogo == 60) {
                    val minJogo = 0
                    println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
                } else {
                    val horaJogo = horaJogo - 1
                    println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
                }
            } else {
                val minJogo = (minFinal - minInicio)
                println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
            }
        } else if (horaInicio == horaFinal && minFinal > minInicio) {
            val horaJogo = 0
            val minJogo = minFinal - minInicio
            println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
        } else {
            val horaJogo = (24 - horaInicio) + horaFinal
            if (minInicio >= minFinal) {
                val minJogo = (60 - minInicio) + minFinal
                if (minJogo == 60) {
                    val minJogo = 0
                    println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
                } else {
                    val horaJogo = horaJogo - 1
                    println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
                }
            } else {
                val minJogo = (minFinal - minInicio)
                println("O JOGO DUROU $horaJogo HORA(S) E $minJogo MINUTO(S)")
            }
        }

    }
}**/



import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val horaInicial = input.nextInt()
    val minInicial = input.nextInt()
    val horaFinal = input.nextInt()
    val minFinal = input.nextInt()

    if (horaInicial in 0..24 && minInicial in 0..60 && horaFinal in 0..24 && minFinal in 0..60 ) {
        var duracaoHora = when {
            horaFinal > horaInicial -> horaFinal - horaInicial
            horaFinal == horaInicial && minInicial == minFinal -> 24
            horaFinal == horaInicial && minInicial < minFinal -> 0
            else -> (24 - horaInicial) + horaFinal
        }

        val duracaoMin: Int

        when {
            minFinal > minInicial -> duracaoMin = minFinal - minInicial
            minFinal == minInicial -> duracaoMin = 0
            horaFinal == horaInicial && minInicial < minFinal -> duracaoMin = minFinal - minInicial
            else -> {
                duracaoMin = (60 - minInicial) + minFinal
                duracaoHora -= 1
            }
        }

        println("O JOGO DUROU $duracaoHora HORA(S) E $duracaoMin MINUTO(S)")

    }
}