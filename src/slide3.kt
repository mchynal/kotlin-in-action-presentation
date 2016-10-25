//TODO string extend, camelCase
fun main(args: Array<String>) {
    //nazwaKolumny
    println("nazwa_kolumny".toCamelCase())
}

fun String.toCamelCase() = this.split("_")
        .map { it.capitalize() }
        //.fold("",{sum,i -> sum+i})
        .joinToString("")
        .decapitalize()

