package Atividade02

fun main(){
    OrdemCrescente()
}

//  leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.
fun OrdemCrescente(){
    var n = listOf<Int>()
    while (n.size!=3) {
        var x= readLine().toString().toInt()
        n += x
    }
    print(n.sorted())
}

