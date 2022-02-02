package collections

data class Frutas (var nome : String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Frutas("Banana", 1.50), Frutas("Morango", 3.20))

    for(fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    println(frutas.contains(Frutas("Banana", 1.50)))
    println(frutas.distinctBy { it.preco })
    frutas.clear()
    println(frutas)
}