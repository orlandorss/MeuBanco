package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Pessoa


fun main(){
    val orlando = Pessoa(nome = "Orlando Rodrigues", cpf = "123.123.123-12")
    println(orlando.nome)
    println(orlando.cpf)


    val jorge = Funcionario(nome: "Orlando Rodrigues", cpf :"123.123.123-22",BigDecimal.valueOf(val: 2000.0) )
    println(jorge.nome)
    println(jorge.cpf)
    println(jorge.salario)
}