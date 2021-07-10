package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Cliente
import one.digitalinnovation.collections.ClienteTipo

fun main (){

        val orlando = Cliente(name = "Orlando Rodrigues", cpf = "123.123.122-12",clienteTipo = ClienteTipo.PF,password = "123456")
println(orlando)
    TesteAuthent().autentica(orlando)
}
