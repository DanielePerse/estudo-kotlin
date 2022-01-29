package classes

enum class Diasemana2(val id: Int, val nome: String, val util: Boolean) {
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda", true),
    ERCA(3, "Terça", true),
    QUARTA(4, "Quarta", true),
    QUINTA(5, "Quinta", true),
    SEXTA(6, "Sexta", true),
    SABADO(7, "Sábado", false)
}

fun main(args: Array<String>) {
    for (dia in Diasemana2.values()) {
        println("${dia.nome} é um dia ${if(dia.util) "útil" else "do fim de semana"}.")
    }
}