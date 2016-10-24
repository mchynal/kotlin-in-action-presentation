fun main(args: Array<String>) {

    val person = Person("Jan", "Kowalski")

    println(person)
    println(person.firstName)

}


data class Person(var firstName: String, var lastName: String)
