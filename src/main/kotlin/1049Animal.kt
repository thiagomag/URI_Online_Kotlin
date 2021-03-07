import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val tipo1 = input.next()
    val tipo2 = input.next()
    val tipo3 = input.next()

    if (tipo1 == "vertebrado") {
        if (tipo2 == "ave") {
            if (tipo3 == "carnivoro") {
                println("aguia")
            }else if (tipo3 == "onivoro") {
                println("pomba")
            }
        } else if (tipo2 == "mamifero") {
            if (tipo3 == "herbivoro") {
                println("vaca")
            }else if (tipo3 == "onivoro") {
                println("homem")
            }
        }
    } else if (tipo1 == "invertebrado") {
        if (tipo2 == "inseto") {
            if (tipo3 == "herbivoro") {
                println("lagarta")
            } else if (tipo3 == "hematofago") {
                println("pulga")
            }
        } else if (tipo2 == "anelideo") {
            if (tipo3 == "hematofago") {
                println("sanguessuga")
            } else if (tipo3 == "onivoro") {
                println("minhoca")
            }
        }
    }
}