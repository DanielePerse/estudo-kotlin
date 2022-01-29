package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

// construtor em kotlin
fun main(args: Array<String>) {
    val filme = Filme2("Monstros", 2000, "terror")
    println("${filme.nome} de genero ${filme.genero} foi lancado em ${filme.anoLancamento}")
}