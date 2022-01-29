package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

// dataclass -> forma simples de se obter uma classe centrada em dado com varias funcionalidades pre implementadas

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 340)
    val g2 = Geladeira("Brastemp", 340)
    println(g1 == g2)

    val tv1 = Televisao("Samsung", 55)
    val tv2 = Televisao("Samsung", 55)
    println(tv1 == tv2)
    println(tv1.toString())
    println(tv1.copy()) // consegue gerar novas copias do objeto sem mexer no original
    println(tv1.copy("Lg")) //pode passar os atributos que quer mudar sem mexer no original
    // consegue fazer destructuring em cimm do data class
    val (marca, pol) = tv1
    println("$marca - $pol")
}