/*TODO
*
* <form method="" action="">
*     <input type="text">
* </form>
*
* */


fun main(args: Array<String>) {

    val test = Tag("div").create {
        attr("id", "myDiv")
        attr("style", "border: 1px")
        child("form", {
            attr("action","/save")
            attr("method","POST")
            child("input", {
                attr("type", "text")
                attr("name", "accountNo")
                attr("required", "true")
            })
        })
    }

    println(test)

}


class Tag(val tag: String) {

    var attrs = listOf<String>()
    var children = listOf<Tag>()

    //TODO create(block)
    fun create(block: Tag.() -> Unit): Tag {
        block.invoke(this)
        return this
    }

    //TODO attr(name,value)
    fun attr(name: String, value: String) {
        attrs = attrs.plus("""$name="$value"""")
    }

    //TODO child(tag,block)
    fun child(tagName: String, block: Tag.(Tag) -> Unit) {
        val t = Tag(tagName)
        block.invoke(t, t)
        children = children.plus(t)
    }

    //TODO toString
    override fun toString(): String {
        return "<$tag ${attrs.joinToString(" ")}>${childrenToString()}</$tag>"
    }

    private fun childrenToString() = if (children.isNotEmpty()) "\n${children.joinToString("\n")}\n" else ""


}