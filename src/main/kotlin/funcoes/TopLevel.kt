package funcoes

//topLevel: nao utiliza classe
fun min(a: Int, b:Int): Int = if(a < b) a else b

fun main(args: Array<String>) {
    print("O menor valor é ${min(1, 6)}")
}
