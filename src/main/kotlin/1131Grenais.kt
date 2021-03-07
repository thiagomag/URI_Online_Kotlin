import java.util.*

fun main(args: Array<String>) {

    val placar = Scanner(System.`in`)

    val placarInter = placar.nextInt()
    val placarGremio = placar.nextInt()

    var vitoriaInter = 0
    var vitoriaGremio = 0
    var empate = 0

    when {
        placarInter > placarGremio -> vitoriaInter += 1
        placarInter < placarGremio -> vitoriaGremio += 1
        placarInter == placarGremio -> empate += 1
    }

    var qntGrenais = 1
    println("Novo grenal (1-sim 2-nao)")
    var novoJogo = placar.nextInt()

       while(novoJogo == 1) {

            if (novoJogo == 1) {
                val placarInter = placar.nextInt()
                val placarGremio = placar.nextInt()

                when {
                    placarInter > placarGremio -> vitoriaInter += 1
                    placarInter < placarGremio -> vitoriaGremio += 1
                    placarInter == placarGremio -> empate += 1
                }
            }
            qntGrenais += 1
            println("Novo grenal (1-sim 2-nao)")
            novoJogo = placar.nextInt()
       }

    println("$qntGrenais grenais\n" +
            "Inter:$vitoriaInter\n" +
            "Gremio:$vitoriaGremio\n" +
            "Empates:$empate")

        if (vitoriaInter > vitoriaGremio) {
            println("Inter venceu mais")
        } else {
            println("Gremio venceu mais")
        }
}