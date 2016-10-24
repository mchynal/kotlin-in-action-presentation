fun main(args: Array<String>) {

    println(Factory.create(1))
    println(Factory.create("a"))
    println(Factory.create(1.2))

    Factory.box.create('c')
}

//TODO companion, create, T
class Factory{
    companion object box{
        fun <T> create(content: T) : Box<T>{
            return Box(content)
        }
    }
}

//TODO Box<T>
class Box<out T>(val content: T){
    override fun toString(): String {
        return "Box(content=$content)"
    }
}