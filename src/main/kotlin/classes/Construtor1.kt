package classes

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String
    constructor(nome: String, anoLancamento: Int, genero: String = "drama") {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme("Poderoso chefao", 1972)
    println("O ${filme.nome} de genero ${filme.genero} foi lancado em ${filme.anoLancamento}")
}