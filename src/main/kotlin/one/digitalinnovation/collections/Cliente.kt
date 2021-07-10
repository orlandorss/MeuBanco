package one.digitalinnovation.collections

class Cliente(
    name: String,
    cpf: String,
   val clienteTipo: ClienteTipo,
   val password: String

):Pessoa(name, cpf),Login {
    override fun log(): Boolean = "123456" == password

    override fun toString(): String =  """
       Name: $name
       CPF:  $cpf
       Type: ${clienteTipo.descricao}
     """.trimIndent()
}