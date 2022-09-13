import br.com.alura.modelo.*

fun testaContasDiferentes() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "159.458.758-96",
        senha = 1,
        endereco = Endereco(
            logradouro = "José Candido Vitor",
            bairro = "Belém",
            numero = 1290,
            cidade="Taubaté",
            estado = "São Paulo",
            cep = "12908098",
        )
    )
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )
    val fran = Cliente(nome="Fran", cpf="111.555.222-44", senha = 12)

    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001

    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")

    println(contaCorrente.titular.endereco.estado)


}