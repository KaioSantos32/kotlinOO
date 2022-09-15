import br.com.alura.modelo.Endereco

fun main() {

    val enderecoNulo: Endereco? = Endereco()
    enderecoNulo?.let{endereco: Endereco? ->
    // Caso nao use um nome, utilizar `it`
        println(endereco?.logradouro?.length)
        // Elvis operator:
        val tamanhoComplemento: Int = endereco?.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
                                         // caso seja nulo, faça isso:
        println(tamanhoComplemento)
    }

}