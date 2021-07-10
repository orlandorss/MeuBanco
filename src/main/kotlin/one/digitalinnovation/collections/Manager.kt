package one.digitalinnovation.collections

 class Manager(
    name: String,
    cpf: String,
    salary: Double,
   val password: String

):Employee (name, cpf, salary),Login{
    override fun assistance(): Double = salary * 0.4
    override fun log(): Boolean = "senha123" == password
}