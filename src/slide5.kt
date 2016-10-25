fun main(args: Array<String>) {

//    println(maybeNull(11)?.length)

    println(maybeNull(11).orEmpty().length)

    println(maybeNull(11)!!.length)

}

fun maybeNull(int: Int) : String?  = if (int > 10) "okokokok" else null