package fundamentos

fun main(args: Array<String>) {
    /*
    * Toda variável em kotlin, tem um tipo fixo. No momento que atribuo algum valor, o kotlin já infere o tipo
    * dessa forma é uma liguagem tipada. Posso explicitar tb, nao tem problema.
    */

    var a: Int // explicitou o tipo
    var b = 2 // Tipo inferido

    a = 10

    print(a + b)
}