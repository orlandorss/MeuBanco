package one.digitalinnovation.collections.testes

import one.digitalinnovation.collections.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.info())
  

    val banco2 = digiOneBank.copy(nome = "Santander")
    println(banco2.info())
}