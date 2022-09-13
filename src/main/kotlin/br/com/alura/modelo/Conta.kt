package br.com.alura.modelo


abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
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


    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}