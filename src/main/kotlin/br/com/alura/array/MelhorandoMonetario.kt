package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.reflect.typeOf

fun main(){
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.0", "1700.0", "2000.0", "2500.0")

//    val salarios =Array<BigDecimal>(size = 5) { BigDecimal.ZERO }
        /* the way to start a BigDecimal is using the .ZERO, ONE or TEN */
//
//    salarios[0] = "1500.0".toBigDecimal()
//    salarios[1] = "1700.0".toBigDecimal()
//    salarios[2] = "1900.0".toBigDecimal()
//    salarios[3] = "2000.0".toBigDecimal()
//    salarios[4] = "2500.0".toBigDecimal()

    val aumento = 1.1.toBigDecimal()

    val salariosComAUmento: Array<BigDecimal> = salarios
            .map { salario ->
                if(salario < "5000".toBigDecimal()){
                    salario + "500.0".toBigDecimal()
                }else{
                    (salario * aumento).setScale( 2, RoundingMode.UP)
                }
            }
            .toTypedArray()

    println(salarios.contentToString())
    println(salariosComAUmento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    // valores é considerado um tipo de array
    return Array<BigDecimal>(size = valores.size) { i ->
        valores[i].toBigDecimal()
    }
}
