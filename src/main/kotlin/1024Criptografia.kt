import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextLine().toInt()

    for (i in 1..qtd) {
        val text = input.nextLine().toCharArray()

        val length = text.size
        val half = length / 2

        for (x in 0 until length) {  //somando +3 na tabela ASCII
            if (Character.isLetter(text[x])) {
                text[x] = (text[x].toInt() + 3).toChar()
            }
        }

        for (y in 0 until half) { //colocando os caracteres do final para o inicio
            val temp = text[y]
            text[y] = text[text.size - y - 1]
            text[text.size - y - 1] = temp
        }

        for (z in half until length) {
            text[z] = (text[z].toInt() - 1).toChar()
        }

        println(text.joinToString(""))
    }
}