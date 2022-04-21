/*Elaborar um programa que efetue a apresentação do valor da
conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
deverá solicitar o valor da cotação do dólar e também a quantidade
de dólares disponíveis com o usuário. Considere que o valor do dólar
Exercícios está em R$4,00
*/

fun main() {
dolarReal()
}

fun dolarReal(){
    println("Infome a quantidade de dolares que deseja converter: ")
    val dolar = readln().toDouble()

    println("Informe o valor da cotação do Dólar")
    val cotacaoDolar = readln().toDouble()

    println("O valor em real é = R$ ${cotacao(dolar, cotacaoDolar)}")
}

fun cotacao(dolar: Double, cotacaoDolar: Double):Double {

    return dolar * cotacaoDolar
}