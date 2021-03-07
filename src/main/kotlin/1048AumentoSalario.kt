import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()

    val reajuste = when {
        salario > 2000 -> 4
        salario > 1200 -> 7
        salario > 800 -> 10
        salario > 400 -> 12
        else -> 15
    }

    val novoSalario = salario * (1 + reajuste/100.0)

    System.out.printf("Novo salario: %.2f\n", novoSalario)
    System.out.printf("Reajuste ganho: %.2f\n", salario * reajuste/100.0)
    println("Em percentual: $reajuste %")
}





/**import java.util.*

fun main(args: Array<String>) {

    val salario = readLine()?.toDouble()


    when(salario!!) {
        in 0.00..400.00 -> {
            val percAumento = 15
            val reajuste = salario * (percAumento.toDouble() / 100)
            val novoSalario = salario + reajuste
            System.out.printf("Novo salario: %.2f\n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f\n", reajuste)
            println("Em percentual: $percAumento %")
        }
        in 400.01..800.00 -> {
            val percAumento = 12
            val reajuste = salario * (percAumento.toDouble() / 100)
            val novoSalario = salario + reajuste
            System.out.printf("Novo salario: %.2f\n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f\n", reajuste)
            println("Em percentual: $percAumento %")
        }
        in 800.01..1200.00 -> {
            val percAumento = 10
            val reajuste = salario * (percAumento.toDouble() / 100)
            val novoSalario = salario + reajuste
            System.out.printf("Novo salario: %.2f\n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f\n", reajuste)
            println("Em percentual: $percAumento %")
        }
        in 1200.01..2000.00 -> {
            val percAumento = 7
            val reajuste = salario * (percAumento.toDouble() / 100)
            val novoSalario = salario + reajuste
            System.out.printf("Novo salario: %.2f\n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f\n", reajuste)
            println("Em percentual: $percAumento %")
        }
        else -> {
            val percAumento = 4
            val reajuste = salario * (percAumento.toDouble() / 100)
            val novoSalario = salario + reajuste
            System.out.printf("Novo salario: %.2f\n", novoSalario)
            System.out.printf("Reajuste ganho: %.2f\n", reajuste)
            println("Em percentual: $percAumento %")
        }
    }
}**/
