package br.com.alura.exception

class FalhaAutenticacaoException (
    mensagem: String = "Falha na autenticacao"
): Exception(mensagem)
