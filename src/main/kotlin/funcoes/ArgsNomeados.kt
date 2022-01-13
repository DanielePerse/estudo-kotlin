package funcoes

fun relacaoTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe"
}

// ir em file -> power save mode e retirar flag (isso habilita o recurso de explicaitar as variaveis l.9)
// l. 10 -> nomeia manualmente - posso ate inverter a ordem - tras clareza
fun main(args: Array<String>) {
    println(relacaoTrabalho("Maria", "Joao"))
    print(relacaoTrabalho(funcionario = "Joao", chefe = "Maria"))
}