package br.com.alura.exception

class SaldoInsuficienteException(
        mensagem: String = "Saldo insuficiente") : Exception(mensagem)