package br.com.alura.array

fun main (){
    val array = IntArray(size = 4)

    array[0] = 41
    array[1] = 19
    array[2] = 24
    array[3] = 32

    var maiorIdade = 0
    for(i: Int in array){
        if(i > maiorIdade){
            maiorIdade = i
            println("Maior Idade é agora é: $i")
        }
    }
    print(maiorIdade)

}
