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
    notasAlunos(qtddAlunos)
}

fun notasAlunos(qtddAlunos: DoubleArray) {

    qtddAlunos.forEachIndexed { index, notas ->
        println("Informe a nota do ${(index + 1)} aluno")
        qtddAlunos[index] = readln().toDouble()
    }
    mediaAlunos(qtddAlunos)

}

fun mediaAlunos(qtddAlunos: DoubleArray): Double {

    var soma = 0.0
    var media = 0.0

    qtddAlunos.forEachIndexed { index, notas ->
        soma += qtddAlunos[index]
        media = soma/ qtddAlunos.size
    }
    println(media)
    return media


}