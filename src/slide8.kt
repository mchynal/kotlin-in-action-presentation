fun main(args: Array<String>) {

    println(Factory.create(1))
    println(Factory.create("a"))
    println(Factory.create(1.2))

    println(Factory.Companion)

}

//TODO companion, create, T
class Factory{
    companion object {
        fun <T> create(content: T) : Box<T>{
            return Box(content)
        }
    }
}

//TODO Box<T>
data class Box<Any>(val content: Any)