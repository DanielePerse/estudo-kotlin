package lambdas

// ?: elvis operator usado quando algo pode retornar null
// takeIf -> retorna boolean -> se a primeira codicao for verdadeira retorna ela ou nulls
fun main(args: Array<String>) {
    println("Digite sua mensagem:")

    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}