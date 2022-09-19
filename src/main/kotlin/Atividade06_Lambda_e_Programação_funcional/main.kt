package Atividade06_Lambda_e_Programação_funcional

fun main() {
//    anonima()
//    OrdemCrescente()
//    Filter()
    Reduce()

}

//uma variável do tipo função anônima
fun anonima() {
    val subtracao = { a: Int, b: Int -> a - b }
    println(subtracao(5, 2))
}

//utilizando sortedBy
fun OrdemCrescente() {
    val n = mutableListOf<Int>()
    while (n.size != 3) {
        print("Digite um número: ")
        val x = readLine().toString().toInt()
        n += x
    }
    print(n.sortedBy { it })
}

//utilizando filter
fun Filter() {
    val numeros: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
    val numerospares = numeros.filter { it % 2 == 0 }
    print(numerospares)
}

//utilizando reduce
fun Reduce() {
    val numeros = listOf(5, 2, 10, 4)
    val soma = numeros.reduce { x, y -> x + y }
    println(soma)
}
