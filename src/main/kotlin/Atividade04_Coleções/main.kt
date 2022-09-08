package Atividade04_Coleções

fun main() {
    Colecao10()

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
