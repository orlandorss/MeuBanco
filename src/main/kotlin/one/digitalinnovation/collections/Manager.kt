package one.digitalinnovation.collections

class Manager(name: String,
              cpf: String,
              salary: Double
):Employee (name, cpf, salary){
    override fun assistance(): Double = salary * 0.4

}