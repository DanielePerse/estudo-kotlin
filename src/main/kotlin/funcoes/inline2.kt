package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no metodo $nomeFuncao...")

    try {
        return funcao()
    } finally {
        println("metodo $nomeFuncao finalizado")
    }
}

fun somar2(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val resultado = executarComLog("somar") {
        somar2(4, 5)
    }
    println(resultado)
}
