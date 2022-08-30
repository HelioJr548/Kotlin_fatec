//Função utilizada para Potenciação: funciona em Double ou Float
import kotlin.math.pow

fun main() {
//    ex3()     //Multiplicação de dois números
//    ex4()     //Graus Fahrenheit
//    ex5()     //Graus Celsius
//    ex6()     //Valor do volume
//    ex7()     //Idade de uma pessoa em dias
//    ex8()     //Àrea da circunferência.
//    ex9()     //Valor de uma prestação em atraso
//    ex10()    //Cotação Dolar
//    ex11()    //Troca valor de variáveis
//    ex12()    //Quadrado do numero digitado
//    ex13()    //Resto da divisão por 6
}

fun ex3() {
//    receba 2 números e apresente a multiplicação dos dois números.
    print("digite o primeiro valor: ")
    val n1: Int = readLine().toString().toInt()
    print("digite o segundo valor: ")
    val n2: Int = readLine().toString().toInt()
    println("O resultado da multiplicação dos valores dados é: ${n1 * n2}")
}

fun ex4() {
//    leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
//    A fórmula de conversão é F <-- (9 * C + 160) /5,
//    sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
    print("Digite a temperatura em Celsius: ")
    val c: Double = readLine().toString().toDouble()
    val f: Double = (9 * c + 160) / 5
    println("A temperatura em Fahrenheit é: $f")
}

fun ex5() {
//    leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
//    A formula de conversão é C <-- (F - 32) * (5/9),
//    sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
    print("Digite a temperatura em Fahrenheit : ")
    val f: Double = readLine().toString().toDouble()
    val c: Double = (f - 32.0) * (5.0 / 9.0)
    println("A temperatura em Celsius é: $c")
}

fun ex6() {
//    calcular e apresentar o valor do volume de uma lata de óleo,
//    utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA.
    print("Digite o valor do Raio: ")
    val r: Double = readLine().toString().toDouble()
    print("Digite o valor da Altura: ")
    val h: Double = readLine().toString().toDouble()
    val v: Double = 3.14159 * r.pow(2) * h
    println("O volume da lata de óleo é: $v")
}


fun ex7() {
//    leia a idade de uma pessoa expressa em ano,
//    mês e dia e mostre-as em dias.
    print("Digite quantos anos você esta vivo: ")
    val a: Int = readLine().toString().toInt()
    print("Digite quantos meses você esta vivo: ")
    val m: Int = readLine().toString().toInt()
    print("Digite quantos dias você esta vivo: ")
    val d: Int = readLine().toString().toInt()
    val diasvivos: Int = a * 360 + m * 30 + d
    println("Você esta vivo há: $diasvivos dias")
}

fun ex8() {
//    calcule a área da circunferência.
    print("Digite o valor do Raio: ")
    val r: Double = readLine().toString().toDouble()
    val a: Double = 3.14159 * r.pow(2)
    println("A área da circunferencia é igual a: $a")
}

fun ex9() {
//    cálculo e a apresentação do valor de uma prestação em atraso,
//    utilizando a fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).
    print("Digite o Valor da Prestação: ")
    val v: Double = readLine().toString().toDouble()
    print("Digite a Taxa de Juros: ")
    val tx: Double = readLine().toString().toDouble()
    print("Digite a quantidade de Prestações: ")
    val tm: Int = readLine().toString().toInt()
    val p: Double = v + (v * (tx / 100) * tm)
    println("O valor da Prestação será de R$${v + p} sendo: R$$v de Prestação + R$$p de Juros")
}

fun ex10() {
//    efetue a apresentação do valor da conversão em real de um valor lido em dólar.
//    O programa deve solicitar o valor da cotação do dólar
//    também a quantidade de dólares disponível com o usuário
    print("Digite a cotação do Dolar: ")
    val ct: Double = readLine().toString().toDouble()
    print("Digite o valor que possui em dolares: ")
    val dol: Double = readLine().toString().toDouble()
    val real: Double = dol * ct
    println("Com a quantia de $dol dolares e cotação de $$ct, ao converter você teria: R$$real reais.")
}

fun ex11() {
//    ler dois valores inteiros para as variáveis A e B
//    efetuar a troca dos valores de forma que a variável A receba o valor da variável B e B receba o valor de A.
//    Apresentar os valores trocados.
    print("Digite um numero: ")
    var a: Int = readLine().toString().toInt()
    print("Digite um numero: ")
    var b: Int = readLine().toString().toInt()

    println("Antes da troca dos valores das variaveis. A=$a e B=$b")

    val x: Int = a
    a = b
    b = x

    println("Após a troca dos valores das variaveis. A=$a e B=$b")
}

fun ex12() {
//   efetuar a leitura de um número inteiro e
//   apresentar o resultado do quadrado desse número.
    print("Digite o valor que deseja dobrar:  ")
    val n: Int = readLine().toString().toInt()
    println("O quadrado do numero $n é: ${n * n}")
}

fun ex13() {
//    receba um número e mostre o resto da divisão por 6.
    print("Digite um valor:")
    val n: Int = readLine().toString().toInt()
    print("O resto da divisao de $n por 6 é: ${n % 6}")
}