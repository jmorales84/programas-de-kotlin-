import java.math.BigInteger

fun main() {
    print("Ingresa un número para calcular su factorial: ")
    val numero = readLine()?.toIntOrNull()

    if (numero == null || numero < 0) {
        println("Número Inválido...")
    } else {
        var factorial = BigInteger.ONE  // Inicializa como 1 en BigInteger

        for (i in 1..numero) {
            factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
        }

        println("El factorial de $numero es: $factorial")
    }
}

