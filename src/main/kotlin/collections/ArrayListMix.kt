package collections

fun main(args: Array<String>) {
    val listaMix = arrayListOf("dani", true, 1, 4.6)

    for(item in listaMix) {
        if(item is String) { //smart cast
            println(item.toUpperCase())
        } else {
            println(item)
        }
    }
}