package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ricardo"
    var cpf: String = "123.123.132"
}

fun main() {
  val ric = Pessoa()

    println(ric.nome)
    println(ric.cpf)
}