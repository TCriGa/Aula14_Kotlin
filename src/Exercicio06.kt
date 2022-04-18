/*Faça um programa que receba uma quantidade X de números e
imprimir o menor número (suponha números diferentes) entre eles.
Obs: use vetores para a resolução do exercício
* */

fun main() {
    dados()

}

fun dados() {

    println("Por favor, informe quantos números você quer digitar: ")
    var n = readln().toInt()
    var qttdN = DoubleArray(n)

    qttdN.forEachIndexed { index, i ->
        println("Informe o valor do ${(index + 1)}º número")
        qttdN[index] = readln().toDouble()

    }
    println("O menor valor é = " + menorValor(qttdN))

}

fun menorValor(qtddN: DoubleArray): Double {

    var menor = qtddN[0];

    qtddN.forEachIndexed { index, num ->
        if (qtddN[index] < menor) {
            menor = qtddN[index]
        }
    }

    return menor
}

