/*Escrever um programa que leia o nome de N alunos e as notas das
três provas que ele obteve no semestre. No final informar o nome do
aluno e a sua média (aritmética)
Obs: use vetores para a resolução do exercício
* */

fun main() {
    quantidadeAlunos()


}

fun quantidadeAlunos() {
    println("Informe a quantidade de alunos: ")
    val nAlunos = readln().toDouble()
    val qtddAlunos = DoubleArray(nAlunos.toInt())

    nomeAlunos(qtddAlunos)


}

fun nomeAlunos(qtddAlunos: DoubleArray) {

    qtddAlunos.forEachIndexed { index, nome ->
        println("Informe o nome do ${(index + 1)} º aluno")
        var nome = readln()

        var nomeAlunos1 = arrayOf<String>(nome)
        notasAlunos(nomeAlunos1)
    }
}

fun notasAlunos(nomeAlunos1: Array<String>) {
    val notasA = DoubleArray(3)

    nomeAlunos1.forEachIndexed { index, notas ->

        println("Informe a 1ª nota do ${nomeAlunos1[index]} aluno")
        notasA[index] = readln().toDouble()
        println("Informe a 2ª nota do ${nomeAlunos1[index]} aluno")
        notasA[index] = readln().toDouble()
        println("Informe a 3ª nota do ${nomeAlunos1[index]} aluno")
        notasA[index] = readln().toDouble()
        mediaAlunos(notasA, nomeAlunos1)

    }

}

fun mediaAlunos(notasA: DoubleArray, nomeAlunos1: Array<String>): Double {
    var soma = 0.0
    var media = 0.0

    notasA.forEachIndexed { i, notas ->
        soma += notasA[i] + notasA[i] + notasA[i]
        media = soma / notasA.size
    }
    println("A média do aluno ${nomeAlunos1[0]} é = $media")
    return media
}



