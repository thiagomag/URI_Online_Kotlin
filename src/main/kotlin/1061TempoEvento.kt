import java.util.*
import kotlin.math.min

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    input.next()
    val diaInicial = input.nextInt()
    val horaInicial = input.nextInt()
    input.next()
    val minInicial = input.nextInt()
    input.next()
    val segInicial = input.nextInt()

    input.next()
    val diaFinal = input.nextInt()
    val horaFinal = input.nextInt()
    input.next()
    val minFinal = input.nextInt()
    input.next()
    val segFinal = input.nextInt()


    if (diaInicial in 0..30 && horaInicial in 0..24 && minInicial in 0..60 && segInicial in 0..60 && diaFinal in 0..30 && horaFinal in 0..24 && minFinal in 0..60 && segFinal in 0..60) {
        var duracaoDia = when {
            diaInicial == diaFinal -> 0
            minInicial < minFinal -> (diaFinal - diaInicial) - 1
            else -> diaFinal - diaInicial
        }

        var duracaoHora = when {
            horaFinal > horaInicial -> horaFinal - horaInicial
            horaFinal == horaInicial && minInicial == minFinal && segInicial == segFinal -> 24
            horaFinal == horaInicial && minInicial < minFinal -> 0
            horaFinal == horaInicial && minInicial < minFinal && segInicial < segFinal-> 0
            else -> (24 - horaInicial) + horaFinal
        }

        var duracaoMin: Int = 0

        when {
            minFinal > minInicial -> duracaoMin = minFinal - minInicial
            minFinal == minInicial -> duracaoMin = 0
            horaFinal == horaInicial && minInicial < minFinal -> duracaoMin = minFinal - minInicial
            minInicial <= minFinal && segInicial > segFinal -> 60 - ((minInicial - minFinal) + 1)
            minInicial >= minFinal && segInicial < segFinal -> (60 - minInicial) + minFinal
            else -> {
                (60 - minInicial) + minFinal
                duracaoHora -= 1
            }
        }

        var duracaoSeg: Int = 0

        when {
            segFinal > segInicial -> duracaoSeg = segFinal - segInicial
            segFinal == segInicial -> duracaoSeg = 0
            horaFinal == horaInicial && minInicial == minFinal && segInicial < segFinal -> duracaoSeg = segFinal - segInicial
            segInicial > segFinal -> duracaoSeg = (60 - segInicial) + segFinal
            else -> {
                (60 - segInicial) + segFinal
              //  duracaoMin -= 1
              //  duracaoHora -= 1
            }
        }
        println("$duracaoDia dia(s)\n" +
                "$duracaoHora hora(s)\n" +
                "$duracaoMin minuto(s)\n" +
                "$duracaoSeg segundo(s)")
    }
}