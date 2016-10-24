
fun main(args: Array<String>) {

    MyValidator().execute {
        it.validDate()
        it.validNum()
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