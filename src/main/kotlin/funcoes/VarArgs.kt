package funcoes

fun ordenar(vararg numeros: Int, a: Int):IntArray {
    println(a)
    return numeros.sortedArray();
}

fun main(args: Array<String>) {
    for (n in ordenar(39, 7, 4, 12, 58, 99, a = 13)) {
        println("$n")
    }
}
