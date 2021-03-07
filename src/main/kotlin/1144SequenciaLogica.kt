fun main(args: Array<String>) {

    val n = readLine()?.toInt()

    for (i in 1..n!!) {
        val j = (i * i)
        val k = (i * i * i)
        val a = j + 1
        val b = k + 1
        println("$i $j $k")
        println("$i $a $b")
    }
}