fun main(args: Array<String>) {

    val person = Person("Jan", "Kowalski")
    val person1 = Person("Jan", "Kowalski")

    println(person)
    println(person.firstName)

    println(person.equals(person1))

}

open class A

class B : A()

data class Person(var firstName: String, var lastName: String)
