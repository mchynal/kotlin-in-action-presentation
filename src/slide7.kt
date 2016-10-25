
fun main(args: Array<String>) {

    MyValidator().execute { v ->
    }
}

class MyValidator : Validator<MyValidator>(){
    fun validDate() {
        println("validating date")
    }

    fun validNum() {
        println("validating num")
    }
}