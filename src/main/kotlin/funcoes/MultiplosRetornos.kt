package funcoes

import java.util.Calendar

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

// aqui simulamos multiplos retornos, usando o operador destructuring
fun main(args: Array<String>) {
    val (h, m, s) = agora()
    println("$h:$m:$s")
}