/*Ler uma temperatura em graus Celsius e apresentá-la convertida em
graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
a temperatura em Fahrenheit e C a temperatura em Celsius.
* */

fun main() {
   Temperatura()
}

fun Temperatura(){
    println("Informe a temperatura em graus Celsius")
    var tempC = readln().toDouble()


    println("A temperatura em Fahrenheit é = " +conversao(tempC))

}

fun conversao(tempC: Double):Double {

    return (9.0 * tempC + 160.0) / 5.0
}