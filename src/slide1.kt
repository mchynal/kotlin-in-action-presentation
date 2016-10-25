//main, print, ;, typy,


//TODO main, types
fun main(args: Array<String>) {
    println("Hello world!")
    hello("ola")
    println(test())
    smartHello()
    smartHello("Marta")
    println(rozneTypy(1))
    println(rozneTypy(10))

    val x : Any = ""
    val y : Any = 5
    x.toString()
    y.toString()
}

//TODO print hello fun, fun as exp, string template
fun hello(name: String) = println("Hello ${name.capitalize()}!")
fun test() = "abc"

//TODO default params
fun smartHello(name: String = "World") = println("Hello $name")

fun rozneTypy(int: Int) : String = if(int>5) "a" else 5.toString()
