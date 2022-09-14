package br.com.alura.modelo

import br.com.alura.exception.FalhaAutenticacaoException
import br.com.alura.exception.SaldoInsuficienteException


abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel{
    var saldo = 0.0
        protected set

    // Quando o companion object nao tem nome, o nome padrão é `Companion`
    //      e não é necessario usar
    companion object{
        var total = 0
            private set
    }

    init {
        Companion.total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }


    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if(saldo < valor){
            throw SaldoInsuficienteException(
                    mensagem = "Saldo insuficiente para a transferencia"
            )
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)


    }
}