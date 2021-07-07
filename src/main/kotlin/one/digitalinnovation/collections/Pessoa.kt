package one.digitalinnovation.collections



class Pessoa {//alter class
    var nome: String = "Orlando"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun nomecpf() = "Nome: $nome CPF: $cpf"
}

fun main() {
    val orlando = Pessoa()

println(orlando.nomecpf())


}