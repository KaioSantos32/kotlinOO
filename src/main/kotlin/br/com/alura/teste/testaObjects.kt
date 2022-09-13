package br.com.alura.teste

import br.com.alura.modelo.*

fun testaObjects() {

    val alex = Cliente(nome="Alex", cpf="111.555.222-44", senha = 12)
    val alexContaPoupanca = ContaPoupanca(titular = alex, numero = 1)
    val alexContaCorrente = ContaCorrente(titular = alex, numero = 1)
    println("${Conta.total} contas")

    val fran = Cliente(nome="Fran", cpf="131.545.222-64", senha =  123)
    val franContaPoupanca = ContaPoupanca(titular = fran, numero = 2)
    val franContaCorrente = ContaCorrente(titular = fran, numero = 2)
    println("${Conta.total} contas")

    val carlos = Cliente(nome="Carlos", cpf="131.625.656-23", senha = 1234)
    val carlosContaPoupanca = ContaPoupanca(titular = carlos, numero = 3)
    val carlosContaCorrente = ContaCorrente(titular = carlos, numero = 3)
    println("${Conta.total} contas")

}