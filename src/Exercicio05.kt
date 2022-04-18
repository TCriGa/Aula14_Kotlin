/*Escreva um programa que receba dois números e ao final mostre a
soma, subtração, multiplicação e a divisão dos números lidos.
* */
fun main() {
    lerEInformarDados()
}

fun lerEInformarDados() {

    println("Por favor, informe o Primeiro número: ")
    var n1 = readln().toDouble()

    println("Por favor, informe o segundo número: ")
    var n2 = readln().toDouble()

    println("O valor da soma é = " + somar(n1,n2))
    println("O valor da subtração é =" + subtrair(n1,n2))
    println("O valor da multiplicação é =" + multiplicar(n1,n2))
    println("O valor da divisão é =" + dividir(n1,n2))

}


fun somar(n1: Double, n2: Double): Double {

    return n1 + n2

}
fun subtrair (n1: Double,n2: Double): Double{

    return n1 - n2

}

fun  multiplicar(n1: Double, n2: Double): Double{

    return n1 * n2
}

fun dividir(n1: Double, n2: Double): Double{

    return n1 / n2
}








