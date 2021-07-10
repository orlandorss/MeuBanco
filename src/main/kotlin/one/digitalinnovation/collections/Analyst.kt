package one.digitalinnovation.collections

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {
    override fun assistance() = salary * 0.1
}