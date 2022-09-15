import br.com.alura.exception.FalhaAutenticacaoException
import br.com.alura.exception.SaldoInsuficienteException
import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca
import br.com.alura.modelo.Endereco
import java.lang.Exception

fun testaComportamentosConta() {
    val alex = Cliente(nome="Alex", cpf="159.458.758-96", senha=1)
    val contaAlex = ContaCorrente(titular = alex, numero = 12345)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome="Fran", cpf="111.555.222-44", senha = 2)

    val contaFran = ContaPoupanca(numero = 1234, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println("saldo atual: ${ contaFran.saldo }")

    println("Transferencia da conta da Fran para o Alex de R$ 300.0")

    try {
        contaFran.transfere(destino = contaAlex, valor = 200.0, senha = 2)
        val endereco = Any()
        endereco as Endereco

    } catch(e: SaldoInsuficienteException){
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("Falha na autenticacao")
        e.printStackTrace()
    } catch (e: Exception){
        println("Ops... Algo deu errado, tente novamente mais tarde")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}