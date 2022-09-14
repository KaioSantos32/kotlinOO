# Pontos importantes para serem lembrados:

### As Exceptions sempre procuram alguem capaz de lidar com elas.

No exemplo utilizado do segundo teste por exemplo:


try {\
&ensp; for (i in 1..5){\
&ensp;&ensp; println(i)\
&ensp;&ensp; val endereco = Any()\
&ensp;&ensp; endereco as Endereco\
&ensp;&ensp; }\
} catch(e: ClassCastException){\
&ensp; println("ClassCastException foi pega")\
}
\
\
No momento em que ocorre a Exception, ela "pergunta" ao `for` se ele sabe lidar com ela, caso ele não saiba, ela "sobe 1 degrau" e vai para o `Try`. \
Como ele sabe lidar com a Exceotion, pois tratamos ela com `(e: ClassCastException)` e o loop esta dentro do `try`, ele sai do loop.\

# Sobre Criação de Exceptions (Aula 3)

Para a criação de exceptions é importante se atentar a 1 coisa: Usar `Exception` e nãp `Throwable`.\
O Throwable é usado na JVM, a maquina virtual do Java que roda todo o projeto Kotlin,
o Kotlin não entra nesses pontos muito expecificos e fundo no backend da aplicação.

Por isso é necessario a utilização do `Exception` no lugar de `Throwable`, e ele é usado da mesma forma.

# Pegando Exceptions

Ao trabalhar com filtragem de exceptions, existem diversas especificasque não vem ao caso decorar todas.\
Por isso é importante endender e saber da existencia da "pai" de todas as Exceptions que é a `Exception`.\

Com o uso de `e: Exception` será englobado todos os tipos de exceptions que não foram tratadas anteriormente, e, 
sendo ele o "Pai" de todas as exceptions, se ele ficar no topo da lista, nada abaixo dele será reconhecido.\

Então uma boa prática é: Sempre que trabalhar com Exceptions, utilizar a pai sempre como ultima Exception, pois é 
como se disesse "Não sei o que mais pode dar exception, entao caso de qualquer outra coisa além do especificado, 
faça isso".\ 