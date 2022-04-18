/*Faça um algoritmo que contenha uma função para ler as dimensões de
um retângulo (base e altura), calcular e imprimir para o usuário a área do
retângulo;
* */

fun main() {
    leituraBaseAltura()
}

fun leituraBaseAltura() {
    println("Por favor, Informe o valor da base do retangulo: ")
    var base = readln().toDouble()

    println("Por favor, informe o valor da altura do retangulo: ")
    var altura = readln().toDouble()

    calculoAreaRetangulo(base, altura)

}

fun calculoAreaRetangulo(base: Double, altura: Double): Double {
    var area = base * altura

    println("O valor da área é = $area")
    return area
}