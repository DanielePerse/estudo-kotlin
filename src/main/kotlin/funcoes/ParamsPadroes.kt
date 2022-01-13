package funcoes

// l.4 os parametros possuem valores default/padrao
fun potencia(base: Int = 2, expoente: Int = 2): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main(args: Array<String>) {
    println(potencia(2, 3))
    println(potencia(10))
    println(potencia(base = 5))
    println(potencia(expoente = 4))
}