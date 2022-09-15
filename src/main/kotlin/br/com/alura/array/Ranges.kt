package br.com.alura.array

fun main(){
    val serie: IntRange= 1.rangeTo(other = 10)
    for(s in serie) {
        println("$serie ")
    }
    // Toda essa função de declaração `rangeTo`, pode ser resumida por:
    val serie1: IntRange = 1..10
    println(serie1.max()/2)


    val numerosPares1: IntProgression = 2..100 step 2 // Imprime numeros de 2 a 100, incluindo o 100
    val numerosPares2: IntProgression = 2.until(to = 100) step 2 // Imprime numeros de 2 a 100, não incluindo o 100

    numerosPares1.forEach { print("$it ") } // melhor forma de imprimir valores em arrays
//    for (numero: Int in numerosPares1){
//        print("$numero ")
//    }
    println()
    val numerosParesReverso: IntProgression = 100 downTo 0 step 2

    numerosParesReverso.forEach { print("$it ")}

    println()

    val intervalo = 1500.0..5000.0
    val salario = 5000.1
    if(salario in intervalo){
        println("Esta dentro do padrao")
    }else{
        println("Não se encontra no intervalo")
    }

    val alfabeto: CharRange = 'a'..'z'
    if('k' in alfabeto){
        println("Esta no alfabeto")
    }
}
