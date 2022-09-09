package Atividade04_Coleções

fun main() {
//    Colecao10()
//    AeB()
//    ColecaoNotas()
    ColecaoFatorial()
}

//  Criar uma coleção com 10 elementos
//  Inserir os elementos de 1 a 10 no vetor
//  Após a inserção, mostrar o vetor
fun Colecao10() {
    val a = arrayListOf<Int>()
    for (i in 1..10) {
        a.add(i)
    }
    println("Vetor: $a")
}

//  Criar uma coleção “A” com 10 elementos
//  Inserir os elementos de 1 a 10 na coleção
//  Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2
//  Mostrar as duas coleçõesObs
fun AeB() {
    val a = arrayListOf<Int>()
    val b = arrayListOf<Int>()
    for (i in 1..10) {
        a.add(i)
    }
    for (i in a) {
        b.add(i * 2)
    }
    print("Vetor A: $a\nVetor B: $b")
}

//   Receber as notas da primeira e da segunda prova de cinco alunos.
//   Armazenar as notas da primeira e da segunda prova em vetores distintos.
//   Calcular e escrever a média de cada aluno.
fun ColecaoNotas() {
    val alunos = arrayListOf<String>("João", "Maria", "Marcos", "José", "Joana")
    var n1 = arrayOf<Double>()
    var n2 = arrayOf<Double>()
    for (i in alunos) {
        print("Digite a Nota da primeira prova de $i: ")
        n1 += arrayOf(readLine().toString().toDouble())
        print("Digite a Nota da segunda prova de $i: ")
        n2 += arrayOf(readLine().toString().toDouble())
    }
    for (i in 0..4) {
        println("A média final de ${alunos[i]}: ${(n1[i] + n2[i]) / 2}")
    }
}

//  Criar um vetor A do tipo inteiro de 5 elementos
//  Solicitar os valores para o usuário e inserir no vetor A
//  Criar um vetor B do tipo inteiro
//  Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B
//  Após de todos os elementos do vetor A, mostrar os dois vetores
fun ColecaoFatorial() {
    val A = arrayListOf<Int>()
    val B = arrayListOf<Int>()
    for (i in 1..5) {
        print("Insira um valor: ")
        A += arrayOf(readLine().toString().toInt())
    }
    for (i in A) {
        B.add(fatorial(i))
    }
    println("Vetor A:  $A")
    println("Vetor A fatorado:  $B")
}

fun fatorial(a: Int): Int {
    var n = 1
    for (i in 1..a) {
        n *= i
    }
    return n
}