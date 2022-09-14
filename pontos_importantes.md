# Pontos importantes para serem lembrados:

## Aula 2: Lidando e retornando Exceptions 

<p>No exemplo utilizado do segundo teste por exemplo:</p>

try {\
&ensp; for (i in 1..5){\
&ensp;&ensp; println(i)\
&ensp;&ensp; val endereco = Any()\
&ensp;&ensp; endereco as Endereco\
&ensp;&ensp; }\
} catch(e: ClassCastException){\
&ensp; println("ClassCastException foi pega")\
}

<p>No momento em que ocorre a Exception, ela "pergunta" ao `for` se ele sabe lidar com ela, caso ele não saiba, ela "sobe 1 degrau" e vai para o `Try`.</p>
<p>Como ele sabe lidar com a Exceotion, pois tratamos ela com `(e: ClassCastException)` e o loop esta dentro do `try`, ele sai do loop.</p>

## Aula 3: Sobre Criação de Exceptions

<p>Para a criação de exceptions é importante se atentar a 1 coisa: Usar `Exception` e nãp `Throwable`.</p>
<p>O Throwable é usado na JVM, a maquina virtual do Java que roda todo o projeto Kotlin,
o Kotlin não entra nesses pontos muito expecificos e fundo no backend da aplicação.</p>

Por isso é necessario a utilização do `Exception` no lugar de `Throwable`, e ele é usado da mesma forma.

## Aula 4: Pegando Exceptions 

<p>Ao trabalhar com filtragem de exceptions, existem diversas especificasque não vem ao caso decorar todas.</p>

<p>Por isso é importante endender e saber da existencia da "pai" de todas as Exceptions que é a `Exception`.</p>

<p>Com o uso de `e: Exception` será englobado todos os tipos de exceptions que não foram tratadas anteriormente, e, 
sendo ele o "Pai" de todas as exceptions, se ele ficar no topo da lista, nada abaixo dele será reconhecido.</p>

<p>Então uma boa prática é: Sempre que trabalhar com Exceptions, utilizar a pai sempre como ultima Exception, pois é 
como se disesse "Não sei o que mais pode dar exception, entao caso de qualquer outra coisa além do especificado, 
faça isso".</p>


## Aula 5: Sobre Null Variables e Null Pointers 

<p>Os tipos nulos dentro do Kotlin obrigado a utilizar o sufixo `?`.
Eles não disponibilizam os seus membros para uso, já que eles, teoricamente, serão nulos também.</p>

<p>A utilização dos membros desses nulos é possível, utilizando a expressão `!!`. 
Essa expressão é uma "segurança" que o código interpreta como "Eu, programador, 
afirmo que o seguinte membro da variavel nula, possui algo armazenado diferente de nulo".</p>

<p>O Erro que ponteiros nulos causam é chamada `NullPointerException`.</p>

## Aula 5: Safe Call (Null Safety)

<p>O Kotlin visa eliminar as referências nulas não desejadas no código para evitar erros pequenos ou catastroficos (<a href="https://en.wikipedia.org/wiki/Tony_Hoare#Apologies_and_retractions">O Erro de 1 Billão de dolares</a>).</p>

## Aula 5: Elvis Operator

<p></p>