package funcoes_de_escopo

data class Person2(var name: String, var age: Int, var about: String){
    constructor(): this("", 0, "")
}

fun writeCreationLog(p: Person2){
    println("A new person ${p.name} was created")
}

fun main(){
    val jake = Person2("Jake", 30, "Android developer").also{
        writeCreationLog(it)
    }
}