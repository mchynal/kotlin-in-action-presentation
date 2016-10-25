import java.util.*

/*TODO
*
* <form method="" action="">
*     <input type="text">
* </form>
*
* */


fun main(args: Array<String>) {

    val test = Tag("hmtl").create {

        child("head", {})
        child("body",{
            child("div",{ div ->
                div.attr("style","border: 1px")
                div.attr("align","left")
                div.attr("align","left")
                div.attr("align","left")
                div.attr("align","left")
                div.child("p",{p->p.attr("a","b")})
            })
        })
    }
    println(test)


}


class Tag(val tag: String) {

    var attrs = mutableSetOf<String>()
    var children = mutableListOf<Tag>()


    //TODO create(block)
    fun create(block: Tag.() -> Unit): Tag {
        block.invoke(this)
        return this
    }

    //TODO attr(name,value)
    fun attr(name: String, value: String) {
        attrs.add(" $name=\"$value\" ")
    }

    //TODO child(tag,block)
    fun child(tagName: String, block: Tag.(Tag) -> Unit) {
        val t = Tag(tagName)
        block.invoke(t, t)
        children.add(t)
    }

    //TODO toString
    override fun toString() = "<$tag ${attrs.joinToString(" ")}>\n${children.joinToString("\n")}\n</$tag>"

    private fun childrenToString() = ""


}