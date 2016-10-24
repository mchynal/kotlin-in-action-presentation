fun main(args: Array<String>) {

    println(maybeNull(1)?.length)

    println(maybeNull(1).orEmpty().length)

    println(maybeNull(1)!!.length)

}

fun maybeNull(int: Int) = if (int > 10) "ok" else null