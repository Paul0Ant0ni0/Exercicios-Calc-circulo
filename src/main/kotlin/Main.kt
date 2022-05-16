import kotlin.math.pow

//1 - Faça um programa em que o usuário
// digite o diâmetro de um círculo e calcule a área e o perímetro dele

fun main() {
    val pi = 3.14
    println("   Vamos calcular a área e o perímetro do circulo")

    println("Qual é o  diâmetro do circulo? ")
    print("Diâmetro: ")
    var diametro = readln().toDouble()
    var raio = diametro /2
    var perimetro = (2*pi)*raio
    var area = pi*(raio.pow(2.0))
    println("\nÁrea: $area m²")
    print("Perímetro: $perimetro m\n")
}