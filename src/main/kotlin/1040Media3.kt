import java.util.*

fun main(args: Array<String>) {


    val notas = Scanner(System.`in`)
    val n1 = notas.nextFloat()
    val n2 = notas.nextFloat()
    val n3 = notas.nextFloat()
    val n4 = notas.nextFloat()

    val media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10
    System.out.printf("Media: %.1f\n", media)

    if (media >= 7.0) {
        println("Aluno aprovado.")
    } else if (media < 5.0) {
        println("Aluno reprovado.")
    } else if ((media >= 5.0) && (media < 7.0)){
        println("Aluno em exame.")
        val nExame = notas.nextFloat()
        val mediaExame = (nExame + media) / 2
        if (mediaExame >= 5.0) {
           println("Nota do exame: $nExame\nAluno aprovado.\nMedia final: $mediaExame")
        } else {
           println("Nota do exame: $nExame\nAluno reprovado.\nMedia final: $mediaExame")
        }
    }
}
