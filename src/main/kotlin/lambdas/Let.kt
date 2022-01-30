package lambdas
// usando let quero que imprima somente elementos validos
// nao retorna o objeto que vc esta trabalhando, entao nao consegue encadear chamadas

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for(item in listWithNulls) {
        item?.let {
            println(it)
        }
    }
}