package Atividade05_Classes_e_Objetos

fun main() {
    val f1 = Funcionario()
    f1.apply {
        print("Nome: "); nome = readLine().toString()
        print("Salario Bruto: "); salarioBruto = readLine().toString().toDouble()
        print("Desconto: "); desconto = readLine().toString().toDouble()
    }

    println("Nome: ${f1.nome}")
    println("Salario Liquido: R$ ${f1.salarioLiquido()}")
    print("Porcentagem de aumento: ")
    val porcentagem = readLine().toString().toDouble()

    println("Nome: ${f1.nome}")
    println("Salario Liquido antes do aumento: R$ ${f1.salarioLiquido()}")
    f1.apply { aumentarSalario(porcentagem) }
    println("Salario Liquido depois do aumento de $porcentagem%: R$ ${f1.salarioLiquido()}")
}

data class Funcionario(var nome: String = " ", var salarioBruto: Double = 0.0, var desconto: Double = 0.0) {

    fun salarioLiquido(): Double {
        return salarioBruto - desconto
    }

    fun aumentarSalario(porcentagem: Double) {
        salarioBruto += (porcentagem / 100) * salarioBruto
    }
}