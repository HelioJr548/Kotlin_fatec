package Atividade02

fun main() {
//    OrdemCrescente()
//    MediaAluno()
    MaiorDe3()
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
    val n = mutableListOf<Double>()    //Cria lista
    while (n.size != 4) {   // Enquanto tamanho da lista(n) for difernte de 4
        print("Nota: ") //Mensagem para usuario
        val x = readLine().toString().toDouble()    //Variavel para input
        if (x < 0 || x > 10) {  //Estrutura condicional para notas maiores que 10 ou menor que 0
            println("Valor Inválido, apenas número entre 0 e 10")   //Mensagem caso condição for Verdadeira
        } else {    //Caso condição for Falsa
            n += x  //Insere valores digitados na lista
        }
    }
    val media: Double =
        n.sumOf { it } / n.size //Calcula média dividindo soma do conteudo da lista por tamanho da lista
    if (media >= 7) {   //Se média maior ou igual a 7
        print(  //Mensagem se condição for Verdadeira
            "O Aluno foi APROVADO por obter média necessária.\n" +
                    "Média do Aluno: $media"
        )
    } else {
        print(  //Mensagem se condição for Falsa
            "O Aluno foi REPROVADO por não obter média necessária.\n" +
                    "Média do Aluno: $media"
        )
    }
}

//  leia 3 números inteiros e mostre o maior deles.
fun MaiorDe3() {
    val n = mutableListOf<Int>()    //Criação de lista mutavel
    for (i in 1..3) {   // Looping com contador de 1 a 3
        print("Digite um número: ") //Mensagem para usuario
        val x = readLine().toString().toInt() //Variavel para input
        n += x //Adiciona o input na lista(n)
    }
    print("O maior número digitado foi ${n.max()}") //Output
}
