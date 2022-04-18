/*Faça um algoritmo que contenha uma função que receba o nome de um
usuário e retorne a mensagem Meu nome é <NomeDigitado>.
* */

fun main() {
    leituraNome()
}

fun leituraNome(){
    println("Informe o seu nome: ")
    val nome = readln()
    mensagem(nome)
    
}

fun mensagem(nome: String){
    println("Meu nome é $nome")
}