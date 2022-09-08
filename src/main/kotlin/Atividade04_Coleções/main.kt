package Atividade04_Coleções

fun main() {
//    Colecao10()
    AeB()
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