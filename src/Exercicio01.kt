/*Faça um algoritmo que contenha um método que receba um número do
usuário e realize a somatória de todos os números no intervalo de 1 até o
número digitado pelo usuário. Exiba o resultado final da somatória.
* */
fun main() {
leituraUsuario()
}

fun leituraUsuario() {
    println("Informe um número Inteiro")
    var n = readln().toInt()

somatoria(n)
}

fun somatoria(n: Int){
    var soma = 0

    for (i in 1..n){
        soma += i

    }
    println("O valor da soma de 1 á $n é = $soma")

}