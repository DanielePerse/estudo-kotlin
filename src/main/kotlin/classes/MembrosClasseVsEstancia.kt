package classes

class ItemDePedido(val nome: String, var preco: Double) {
    companion object {
        fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main(args: Array<String>) {
    val item1 = ItemDePedido.create("Tv", 2567.99)
    val item2 = ItemDePedido("torradeira", 100.0)
    ItemDePedido.desconto = 0.1

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}