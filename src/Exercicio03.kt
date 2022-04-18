@file:Suppress("UNREACHABLE_CODE")
/*Faça um algoritmo que contenha uma função que calcule o IMC de um
usuário a partir da inserção do seu peso e de sua altura. Exiba a
classificação do usuário após a verificação do seu IMC.

IMC CLASSIFICAÇÃO OBESIDADE (GRAU)
MENOR QUE 18,5 MAGREZA 0
ENTRE 18,5 E 24,9 NORMAL 0
ENTRE 25,0 E 29,9 SOBREPESO I
ENTRE 30,0 E 39,9 OBESIDADE II
MAIOR QUE 40,0 OBESIDADE GRAVE III
* */

fun main() {
    leituraDeDados()
}

fun leituraDeDados() {
    println("Por favor, informe o seu peso:")
    var peso = readln().toDouble()

    println("Por favor, Informe sua altura")
    var altura = readln().toDouble()

    calculoIMC(peso, altura)
}

fun calculoIMC(peso: Double, altura: Double) {
    var imc = peso / (altura * altura)


    tabelaImc(imc)
}

fun tabelaImc(imc: Double):Double {

    when (imc) {
        in 0.0 .. 18.5 -> println("IMC = %.2f".format(imc) + " - classificação: Magreza")
        in 18.5 .. 24.9 -> println("IMC = %.2f".format(imc) + " - classificação: Normal")
        in 25.0 .. 29.9 -> println("IMC = %.2f".format(imc) + " - classificação: Sobrepeso -> Obesidade Grau I")
        in 30.0 .. 39.9 -> println("IMC = %.2f".format(imc) + " - classificação: Obesidade -> Obesidade Grau II")
        in 40.0 .. 1000.0 -> println("IMC = %.2f".format(imc) + " - classificação: Obesidade Grave -> Obesidade Grau II")
    }

    return imc
}