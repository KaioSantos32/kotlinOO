import br.com.alura.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val analista = Analista(
        nome = "Bryan",
        cpf = "111.555.444-55",
        salario = 1800.91
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 1000)
    sistema.entra(diretora, senha = 2000)
    sistema.entra(cliente, senha = 1234)
}