package collections

fun main(args: Array<String>) {
    val numeros = Array<Int>(10) { indice -> indice * 10 }

    for(numero in numeros) {
        println(numero)
    }

    println(numeros.get(1))
    println(numeros.size)
    numeros.set(4, 1000)
    println(numeros[4])
}