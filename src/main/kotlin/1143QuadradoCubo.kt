fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    for (i in 1..n!!) {
        val j = i * i
        val k = i * i * i
        println("$i $j $k")
    }
}