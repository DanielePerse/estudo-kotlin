package collections

fun main(args: Array<String>) {
    val pares = arrayListOf(6, 5, 4)
    val impares = arrayListOf(3, 2, 1)

    for(n in pares.union(impares).sorted()) {
        println("$n ")
    }
}