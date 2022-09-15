package br.com.alura.array

fun main(){
    val idades: IntArray = intArrayOf(10, 12, 18, 24, 58, 71, 64)
    val maiorIdade: Int = idades.max()
    val menorIdade: Int = idades.min()

    println(maiorIdade)
    println(menorIdade)

    val mediaIdades = idades.average()
    println(mediaIdades)

    val todosMaiores: Boolean = idades.all { it > 18 }
    println(todosMaiores)

    val algumMaior: Boolean = idades.any { it > 18 }
    println(algumMaior)

    val maioresDeIdade: List<Int> = idades.filter { it >= 18 }
    println(maioresDeIdade)

    val encontraIgualOuMaior: Int? = idades.find { it >= 18 }
    println(encontraIgualOuMaior)

    val encontraIgual: Int? = idades.find { it == 18 }
    println(encontraIgual)

    val encontraMaiorQue: Int? = idades.find { it > 18 }
    println(encontraMaiorQue)

    val encontraNada: Int? = idades.find { it == 17 }
    println(encontraNada)

}