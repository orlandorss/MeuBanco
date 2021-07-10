package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Analyst
import one.digitalinnovation.collections.Employee

fun main(){
    val jorge = Analyst(name = "Jorge Silva", cpf = "123.123.123-11", salary = 2000.0)
    report(jorge)

}

fun report(functionaries: Employee)= println(functionaries.toString())