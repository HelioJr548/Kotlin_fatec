package Atividade03_Funções

import kotlin.math.pow

//  leia tenha 3 opções:
//  1 - Fatorial
//  2 - Quadradro de um número
//  3 - Volume de uma lata
//  4 – Sair do Programa
fun main() {
    var i = 0
    while (i != 4) {
        println(
            "1 - Fatorial \n2 - Quadradro de um número\n" +
                    "3 - Volume de uma lata \n4 – Sair do Programa"
        )
        print("Qual ação deseja executar?: ")
        i = readLine().toString().toInt()
        when (i) {
            1 -> Fatorial()
            2 -> Quadrado()
            3 -> Volume()
            4 -> print("\nPrograma encerrado!!")
            else -> println("\nValor não reconhecido! Digite alguma da opções a seguir: ")
        }
    }
}

fun Fatorial() {
    print("Qual número deseja descobrir o fatorial: ")
    var n: Int = readLine().toString().toInt()
    val f: Int = n
    for (i in n - 1 downTo 1) {
        n *= i
    }
    println("$f! = $n\n")
}

fun Quadrado() {
    print("Digite o valor que deseja elevar ao quadrado:  ")
    val n: Int = readLine().toString().toInt()
    println("O quadrado do numero $n é: ${n * n}\n")
}

fun Volume() {
    print("Digite o valor do Raio: ")
    val r: Double = readLine().toString().toDouble()
    print("Digite o valor da Altura: ")
    val h: Double = readLine().toString().toDouble()
    val v: Double = 3.14159 * r.pow(2) * h
    println("O volume da lata é: $v\n")
}
