package lambdas

// map -> percorre a lista e retorna a mesma com a transformacao que precisamos
fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { print(this) }
}