
//TODO string extend, camelCase
fun main(args: Array<String>) {
    println("nazwa_kolumny".toCamelCase())
}

fun String.toCamelCase(): String {
    return this
            .split("_")
            .map(String::capitalize)
            .joinToString("")
            .decapitalize()
}
