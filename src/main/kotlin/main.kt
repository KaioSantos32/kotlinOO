import br.com.alura.modelo.Cliente
import br.com.alura.modelo.Conta
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.Endereco
import jdk.dynalink.linker.GuardingTypeConverterFactory
import java.lang.ClassCastException
import java.lang.NumberFormatException
import javax.naming.InterruptedNamingException

/**
 * This is a test of this type of comment, it's excellent and good-looking
 * This is what we can do:
 *
 * * [Title]
 * * * [SubTitle]
 * * * * [QuadriTitle]
 *
 * Fim
 */


fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    try {
        for (i in 1..5){
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch(e: ClassCastException){
        println("Impossivel converter para Endereço")
    }
    println("fim funcao2")
}

