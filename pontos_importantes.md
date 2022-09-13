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
