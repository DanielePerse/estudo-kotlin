package funcoes

class Produto(val nome: String, val preco: Double)


infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("ipad", 2450.99)
    val p2 = Produto(preco = 59.99, nome = "balanca")
    println(p1 maisCaroQue p2)
    println(p2.maisCaroQue(p1))
}
