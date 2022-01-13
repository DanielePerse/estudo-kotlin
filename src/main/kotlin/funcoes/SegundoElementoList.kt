package funcoes

// add extensao sem necessidade de heranca
fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    val listA = listOf("Maria", "Joao")
    val listB = listOf("Maria")

    println(listA.secondOrNull())
    println(listB.secondOrNull())
}