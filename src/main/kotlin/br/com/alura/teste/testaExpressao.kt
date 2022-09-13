package br.com.alura.teste

import br.com.alura.modelo.Endereco
import java.lang.ClassCastException

fun testaExpressao() {
    println()
    println("_______________ Primeiro Teste _______________")
    println()
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        // A cada interação, uma Exception é pega,
        // indo até o fim do loop
        try {
            val endereco = Any()
            endereco as Endereco
        } catch (e: ClassCastException) {
            println("ClassCastException foi pega")
        }
    }
    println()
    println("_______________ Fim Primeiro Teste _______________")
}
fun funcao2(){
    println()
    println("_______________ Segundo Teste _______________")
    println()
    // É realizado a tentativa de criação, e caso de uma Exception,
    // sai do loop e continua o código fora dele
    try {
        for (i in 1..5){
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch(e: ClassCastException){
        e.printStackTrace()
        // e.printStackTrace() = message + stackTrave + cause
    }
    println()
    println("_______________ Fim Segundo Teste _______________")
    println()

    println("fim funcao2")
}