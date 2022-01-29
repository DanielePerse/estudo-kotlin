package classes

// faz o mesmo que o exemplo constructor1
class Filme3(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3("Monstros sa", 2000, "desenho")
    println("${filme.nome} de genero ${filme.genero} foi lancado em ${filme.anoLancamento}")
}