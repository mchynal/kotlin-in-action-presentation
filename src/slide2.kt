import java.util.*

//TODO apply
fun main(args: Array<String>) {

    val apply = LinkedList<Int>().apply {
        add(1)
        add(1)
        add(1)
        add(1)
    }

    apply.add(4)
    val a = 5

    println(apply)

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