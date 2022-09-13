# Pontos importantes para serem lembrados:

### As Exceotions sempre procuram alguem capaz de lidar com elas.

No exemplo utilizado do segundo teste por exemplo:

`
try {
         for (i in 1..5){
                 println(i)
                 val endereco = Any()
                 endereco as Endereco
             }
     } catch(e: ClassCastException){
         println("ClassCastException foi pega")
     }
`

no momento em que ocorre a Exception, ela "pergunta" ao `for` se ele sabe lidar com ela,
caso ele não saiba, ela "sobe 1 degrau" e vai para o `Try`, como ele sabe lidar com a Exceotion,
pois tratamos ela com a exception exata que da o erro, ele sai do loop, a exception é tratada e
ele continua o código sem voltar para dentro do loop pois o `try` não esta dentro dele como no
primeiro exemplo.