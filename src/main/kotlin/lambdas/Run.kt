package lambdas
// parecido com apply, entretando nao retorna o proprio objeto

data class Casa(var endereco : String = "", var num : Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()

    casa.run {
        endereco = "rua otaciano"
        num = 620
    }

    println(casa)
}