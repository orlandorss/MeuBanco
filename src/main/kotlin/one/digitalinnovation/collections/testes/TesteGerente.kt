package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Manager

fun main(){
    val ivete = Manager(name = "Ivete Silva", cpf = "123.123.123-11", salary = 5000.0, password = "senha125")
    report(ivete)

    TesteAuthent().autentica(ivete)
}