package lambdas

import funcoes.calc

class Calculadora2 {
    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(valor: Int) {
        resultado += valor
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora2()

    calculadora.apply { soma(2, 3) }.apply { add(1) }.apply { println(resultado) }

    calculadora.apply {
        soma(2, 3)
        add(1)
        println(resultado)
    }

    //inline function
    with(calculadora) {
        soma(2, 3)
        add(1)
        println(resultado)
    }
}