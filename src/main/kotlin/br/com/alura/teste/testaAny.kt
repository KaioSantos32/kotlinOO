package br.com.alura.teste

import br.com.alura.modelo.Endereco

fun testaAny(){

    val endereco1 = Endereco(logradouro = "Rua Vigueiro", complemento = "Alura", numero = 1000, cep = "12987-098")
    val endereco2 = Endereco(logradouro = "Rua Vigueiro", complemento = "Alura", numero = 1000, cep = "12987-098")

    println(endereco1.equals(endereco2))

    println(endereco1.hashCode())
    println(endereco2.hashCode())

    println(endereco1)
    println(endereco2)

    println("${endereco1.javaClass}@${Integer.toHexString(endereco1.hashCode())})")
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}
