/*Faça um programa que receba o preço de custo de um produto e
mostre o valor de venda. Sabe-se que o preço de custo receberá um
acréscimo de acordo com um percentual informado pelo usuário
*/

fun main() {
    receberDadosPreco()
}

fun receberDadosPreco() {

    println("Por favor, Informe o preço de custo: ")
    val precoCusto = readln().toDouble()

    println("Informe o percentual de acrescimo desejado: ")
    val percentual = readln().toDouble()

    println("${formacaoDePreco(precoCusto, percentual)}")
}

fun formacaoDePreco(precoCusto: Double, percentual: Double) {

    return println("${(precoCusto * (percentual / 100) + precoCusto)}")

    mostrarValorDeVenda(precoCusto,percentual)
}

fun mostrarValorDeVenda(precoCusto: Double, percentual: Double) {
    println("O valor de venda é = R$ ${formacaoDePreco(precoCusto,percentual)}")
}