package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10020030040, "Joao")
    map.put(10020030041, "Joao2")
    map.put(10020030042, "Joao3")

    map.put(10020030042, "Joao3 filho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (nome in map.keys) {
        println(nome)
    }

    for ((cpf, nome) in map.entries) {
        println("$nome (CPF: $cpf)")
    }
}