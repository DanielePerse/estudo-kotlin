package collections

fun main(args: Array<String>) {
    // nao precisa tipar, pois o kotlin ja infere o tipo, atraves do conteudo
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    for(item in strings) {
        println(item.toUpperCase())
    }
}