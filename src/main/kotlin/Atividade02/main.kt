package Atividade02

fun main() {
//    OrdemCrescente()
//    MediaAluno()
//    MaiorDe3()
//    MaiorMenorDe5()
//    ParImpar()
//    Cardapio()
//    Fatorial()
    Top100()
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

//  efetue a leitura de cinco números inteiros e
//  identificar o maior e o menor valor
fun MaiorMenorDe5() {
    val n = mutableListOf<Int>()    //Criação de lista mutavel
    for (i in 1..5) {   // Looping com contador de 1 a 5
        print("Digite um número: ") //Mensagem para usuario
        val x = readLine().toString().toInt() //Variavel para input
        n += x //Adiciona o input na lista(n)
    }
    println("O maior número digitado foi ${n.max()}") //Output para maior numero digitado
    print("O menor número digitado foi ${n.min()}") //Output para menor numero digitado
}

//  efetue a leitura de um número inteiro e
//  apresentar uma mensagem informando se o número é par ou ímpar.
fun ParImpar() {
    print("Digite um número: ") //Mensagem para o usuario
    val n: Int = readLine().toString().toInt()  //Variavel para input
    if (n % 2 == 0) {    //Condicional que verifica se o resto da divisao por 2 é igual a 0
        print("O número $n é par")  //Output caso condição for VERDADEIRA
    } else {
        print("O número $n é impar") //Output caso condição for FALSA
    }
}

//  leia o código do item pedido,
//  a quantidade e calcule o valor a ser pago por aquele lanche.
//  Considere que a cada execução somente será calculado um item.
//  O cardápio de uma lanchonete é o seguinte:
//  Especificação 	Código 	Preço
//  Cachorro quente 	100 	1,20
//  Bauru simples 	101 	1,30
//  Bauru com ovo 	102 	1,50
//  Hambúrger 		103 	1,20
//  Cheeseburguer 	104 	1,30
//  Refrigerante 	105 	1,00
fun Cardapio() {
    var c = 1  //Variavel iniciada para loop
    val map = //Criação de Map
        mapOf(
            100 to 1.20, 101 to 1.30,
            102 to 1.50, 103 to 1.20,
            104 to 1.30, 105 to 1.00
        ) //Key e Values do Map
    while (c != 0) { //Loop enquanto c diferente de 0
        print(  //Descrição do Menu
            "Especificação\t\tCódigo\t\tPreço\n" +
                    "Cachorro quente \t100 \t\t1,20\n" +
                    "Bauru simples \t\t101 \t\t1,30\n" +
                    "Bauru com ovo \t\t102 \t\t1,50\n" +
                    "Hambúrger \t\t\t103 \t\t1,20\n" +
                    "Cheeseburguer \t\t104 \t\t1,30\n" +
                    "Refrigerante \t\t105 \t\t1,00\n" +
                    "Para finalizar pedido digite 0\n" +
                    "Digite o código de sue pedido: "
        )
        c = readLine().toString().toInt() //Variavel recebe input
        if (c in map) { //Verifica se o valor do input existe no Map
            print("Digte a quantidade desejada: ")  //Mensagem para usuario
            val q: Int = readLine().toString().toInt()   //Inicia variavel para input da quantidade
            println(
                "\nSeu pedido foi feito:\n" +
                        "Código: [$c] \tQuantidade: $q \t" +
                        "Valor Unitário: ${String.format("%.2f", map[c])} \t" +
                        "Valor Total: R$${String.format("%.2f", map.getValue(c) * q)}\n"
            )  //Output do pedido feito
        } else if (c !in map && c != 0) { //Verifica se input(c) não esta presente no Map e é diferente de 0
            println("\nValor não reconhecido!\n")   //Mensagem caso "else if" for verdadeiro
        } else {  //Caso "if" e "else if" não forem atendidos
            print("\nPrograma Finalizado!") //Mensagem para usuario
        }
    }
}

// receba um número e mostre o fatorial desse número.
fun Fatorial() {
    print("Qual número deseja descobrir o fatorial: ")  //Mensagem para usuario
    var n: Int = readLine().toString().toInt()  //Input
    val f: Int = n  //Variavel guarda valor de input da usuario
    for (i in n - 1 downTo 1) {    //Laço de Repetição para n-1 até 1
        n *= i  //Multiplica o operando da direita com o da esquerda e atribui o resultado ao operando da esquerda
    }
    print("$f! = $n")   //Output
}

//  apresentar o total da soma obtida dos cem primeiros números inteiros
//  ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100)
fun Top100() {
    var s = 0  //inicia variavel
    for (i in 1..100) { //Laço de repetição de 1 até 100
        s += i  //Soma o operando da direita com o da esquerda e atribui o resultado ao operando da esquerda
    }
    print("A soma dos cem primeiros números inteiros é: $s")    //Output
}