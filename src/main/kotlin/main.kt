import br.com.alura.exception.SaldoInsuficienteException
import br.com.alura.modelo.Endereco

fun main() {
    var endereco: Endereco? = Endereco(logradouro = "@@@@@")
    val logradouroNovo: String? = endereco?.logradouro
    println(logradouroNovo)

}