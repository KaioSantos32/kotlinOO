import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "154.444.875-98", senha = 123)

    val contaJoao = ContaCorrente(joao, numero = 1002)
    val contaMaria = ContaPoupanca(titular = Cliente(
        nome = "Maria",
        cpf = "111.555.444-66",
        senha = 123
    ), numero = 123)

    println("titular conta joao: ${joao.nome}")

    println(contaJoao)
}