
//TODO apply
fun main(args: Array<String>) {

    Maker().apply {
        printA()
        printB()
        printC()
    }
}

class Maker{
    fun printA() = println("A")
    fun printB() = println("B")
    fun printC() = println("C")
}