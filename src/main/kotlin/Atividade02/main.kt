package Atividade02

fun main() {
//    OrdemCrescente()
    MediaAluno()
}

//  leia 3 (três) valores inteiros e
//  apresente os 3 números em ordem crescente.
fun OrdemCrescente() {
    val n = mutableListOf<Int>() //cria lista
    while (n.size != 3) { // enquanto tamanho da lista(n) for difernte de 3
        print("Digite um número: ") //mensagem para usuario
        val x = readLine().toString().toInt() //variavel para input
        n += x //insere valores digitados na lista
    }
    print(n.sorted()) //sorted() organiza lista em ordem crescente
}

//  leia quatro notas escolares de um aluno e
//  imprimir uma mensagem dizendo que o aluno foi aprovado,
//  se o valor da média escolar for maior ou igual a 7.
//  Se o aluno não foi aprovado, indicar uma mensagem informando esta condição
fun MediaAluno() {
    val n = mutableListOf<Double>()    //cria lista
    while (n.size != 4) {   // enquanto tamanho da lista(n) for difernte de 4
        print("Nota: ") //mensagem para usuario
        val x = readLine().toString().toDouble()    //variavel para input
        if (x < 0 || x > 10) {  //estrutura condicional para notas maiores que 10 ou menor que 0
            println("Valor Inválido, apenas número entre 0 e 10")   //mensagem caso condição for Verdadeira
        } else {    //caso condição for Falsa
            n += x  //insere valores digitados na lista
        }
    }
    val media: Double =
        n.sumOf { it } / n.size //calcula média dividindo soma do conteudo da lista por tamanho da lista
    if (media >= 7) {   //se média maior ou igual a 7
        print(  //mensagem se condição for Verdadeira
            "O Aluno foi APROVADO por obter média necessária.\n" +
                    "Média do Aluno: $media"
        )
    } else {
        print(  //mensagem se condição for Falsa
            "O Aluno foi REPROVADO por não obter média necessária.\n" +
                    "Média do Aluno: $media"
        )
    }
}

//  leia 3 números inteiros e mostre o maior deles.
fun MaiorDe3() {

}
