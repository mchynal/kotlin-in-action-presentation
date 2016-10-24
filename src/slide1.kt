
//TODO main, types
fun main(args: Array<String>) {
    //println("Hello world!!!")
    hello("Ola")
    smartHello("Ola")
    smartHello()

}

//TODO render fun, fun as exp, string template
fun hello(name: String) = println("Hello $name!!!")

//TODO default params
fun smartHello(name: String = "World") = println("Hello $name!!!")
