package one.digitalinnovation.collections

import java.math.BigDecimal

abstract class Employee(
    name: String,
    cpf: String,
    val salary: Double,

    ) : Pessoa(name, cpf){
 protected  abstract fun assistance():Double


    override fun toString(): String =  """
       Name: $name
       CPF: $cpf
       Salary: $salary
       Assistance: ${assistance()}
     """.trimIndent()
}