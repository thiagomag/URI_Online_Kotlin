import java.util.*

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

    duracaoEvento(diaInicial, horaInicial, minInicial, segInicial, diaFinal, horaFinal, minFinal, segFinal)
}

fun duracaoEvento(
    diaInicial: Int,
    horaInicial: Int,
    minInicial: Int,
    segInicial: Int,
    diaFinal: Int,
    horaFinal: Int,
    minFinal: Int,
    segFinal: Int
) {
    var duracaoDias = 0
    var duracaoHoras = 0
    var duracaoMin = 0
    var duracaoSeg = 0
    if (diaFinal >= diaInicial) {
        if (horaFinal >= horaInicial) {
            if (minFinal >= minInicial) {
                if (segFinal >= segInicial) {
                    duracaoDias = diaFinal - diaInicial
                    duracaoHoras = horaFinal - horaInicial
                    duracaoMin = minFinal - minInicial
                    duracaoSeg = segFinal - segInicial
                } else {
                    duracaoDias = diaFinal - diaInicial - 1
                    if (horaInicial == horaFinal) {
                        duracaoHoras = 24 + horaFinal - horaInicial - 1
                    } else {
                        duracaoHoras = horaFinal - horaInicial - 1
                    }
                    if (minInicial == minFinal) {
                        duracaoMin = 60 + minFinal - minInicial - 1
                    } else {
                        duracaoMin = minFinal - minInicial - 1
                    }
                    duracaoSeg = 60 + segFinal - segInicial
                }
            } else {
                duracaoDias = diaFinal - diaInicial - 1
                if (horaInicial == horaFinal) {
                    duracaoHoras = 24 + horaFinal - horaInicial - 1
                } else {
                    duracaoHoras = horaFinal - horaInicial - 1
                }
                if (segFinal >= segInicial) {
                    duracaoSeg = segFinal - segInicial
                    duracaoMin = 60 + minFinal - minInicial
                } else {
                    duracaoSeg = 60 + segFinal - segInicial
                    duracaoMin = 60 + minFinal - minInicial - 1
                }
            }
        } else {
            duracaoDias = diaFinal - diaInicial - 1;
            if (segFinal >= segInicial) {
                if (minFinal >= minInicial) {
                    duracaoMin = minFinal - minInicial
                    duracaoSeg = segFinal - segInicial
                    duracaoHoras = 24 + horaFinal - horaInicial
                } else {
                    duracaoMin = 60 + minFinal - minInicial
                    duracaoSeg = segFinal - segInicial
                    duracaoHoras = 24 + horaFinal - horaInicial - 1
                }
            } else {
                if (minFinal >= minInicial) {
                    duracaoMin = minFinal - minInicial - 1
                    duracaoSeg = 60 + segFinal - segInicial
                    duracaoHoras = 24 + horaFinal - horaInicial
                } else {
                    duracaoMin = 60 + minFinal - minInicial - 1
                    duracaoSeg = 60 + segFinal - segInicial
                    duracaoHoras = 24 + horaFinal - horaInicial - 1
                }
            }
        }
    }
    System.out.printf(
        "%d dia(s)\n" +
                "%d hora(s)\n" +
                "%d minuto(s)\n" +
                "%d segundo(s)\n", duracaoDias, duracaoHoras, duracaoMin, duracaoSeg
    )
}
